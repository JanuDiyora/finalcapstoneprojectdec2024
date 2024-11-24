package com.example.demo.service;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ROICalculationFleet;
import com.example.demo.model.FleetInfo;
import com.example.demo.repository.FleetRepository;


@Service
public class FleetService {
		
	 @Autowired
	  private FleetRepository featureRepository;

	    public ROICalculationFleet calculateROI(FleetInfo transitData) {
	        // Fetch the features for different categories
	        BigDecimal totalFeatureCost = BigDecimal.ZERO;
	        int days = 250;
	        double lightVehiclefuelConsume = 15;
	        double heavyVehiclefuelConsume = 6;
	        double insuranceCost5Year = 7500;
	        double maintenanceCost5Year = 5000;
	        double avrageHOSTicketsCost = 1000; 

	        totalFeatureCost = totalFeatureCost.add(getFeatureCost("Augmented Reality Navigation", transitData.getArNavigation()));
	        totalFeatureCost = totalFeatureCost.add(getFeatureCost("Security and Anti-Theft Devices", transitData.getSecurity()));
	        BigDecimal totalVehicles = BigDecimal.valueOf(transitData.getLightVehicles());
	        totalVehicles = totalVehicles.add(BigDecimal.valueOf(transitData.getHeavyVehicles()));
	        
	        
	        BigDecimal heavyVehicleFuel = (BigDecimal.valueOf(transitData.getHeavyVehicles())
	        							  .multiply(BigDecimal.valueOf(transitData.getDistancePerVehicle()))
	        							  .multiply(transitData.getFuelCost())
	        							  .multiply(BigDecimal.valueOf(days)))
	        							  .divide(BigDecimal.valueOf(heavyVehiclefuelConsume), 2, RoundingMode.HALF_UP);
	        
	        BigDecimal lightVehicleFuel = (BigDecimal.valueOf(transitData.getLightVehicles())
					  .multiply(BigDecimal.valueOf(transitData.getDistancePerVehicle()))
					  .multiply(transitData.getFuelCost())
					  .multiply(BigDecimal.valueOf(days)))
					  .divide(BigDecimal.valueOf(lightVehiclefuelConsume), 2, RoundingMode.HALF_UP);
	        
	        BigDecimal totalFuelCost = heavyVehicleFuel.add(lightVehicleFuel);
	        
	        BigDecimal costOfHOS = transitData.getHos().multiply(BigDecimal.valueOf(avrageHOSTicketsCost));
	        
	        BigDecimal driverWages = transitData.getDriverWages() != null ? transitData.getDriverWages() : BigDecimal.ZERO;
	        BigDecimal totalDriverWages = driverWages.multiply(totalVehicles);
	        
	        BigDecimal insuranceCost = (BigDecimal.valueOf(insuranceCost5Year).divide(BigDecimal.valueOf(5)))
					.multiply(totalVehicles);
	        BigDecimal maintenanceCost = (BigDecimal.valueOf(maintenanceCost5Year).divide(BigDecimal.valueOf(5)))
					.multiply(totalVehicles);
	        

	        
	        BigDecimal totalOprationalCost = totalFeatureCost
	        								.add(totalFuelCost)
	        								.add(costOfHOS)
	        								.add(insuranceCost)
	        								.add(maintenanceCost)
	        								.add(totalDriverWages);
	        
	        BigDecimal totalInvestment = transitData.getTotalInvestment() != null ? transitData.getTotalInvestment() : BigDecimal.ZERO;
	        BigDecimal totalAvenue = transitData.getAvenue() != null ? transitData.getAvenue() : BigDecimal.ZERO;
	        		
	        if (totalOprationalCost.compareTo(BigDecimal.ZERO) == 0) {
	            return new ROICalculationFleet(BigDecimal.ZERO, totalOprationalCost, totalAvenue, totalInvestment); // Prevent division by zero
	        }
	        BigDecimal year = transitData.getYear() != null ? transitData.getYear() : BigDecimal.ZERO;

	        BigDecimal roi = ((totalAvenue.subtract(totalOprationalCost))
	        				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
	        BigDecimal yearRoi = roi.multiply(year);
	        return new ROICalculationFleet(yearRoi, totalOprationalCost, totalAvenue, totalInvestment);
	    }

	    private BigDecimal getFeatureCost(String category, String description) {
	    	FleetInfo feature = featureRepository.findByCategoryAndDescription(category, description);
	        return feature != null ? feature.getAmount() : BigDecimal.ZERO;
	    }
	    


  
}
