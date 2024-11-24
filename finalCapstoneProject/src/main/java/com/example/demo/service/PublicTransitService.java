package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ROICalculationTransit;
import com.example.demo.model.PublicTransit;
import com.example.demo.repository.FeatureRepositoryTransit;

@Service
public class PublicTransitService {

    @Autowired
    private FeatureRepositoryTransit featureRepository;

    public ROICalculationTransit calculateROI(PublicTransit transitData) {
        BigDecimal totalFeatureCost = BigDecimal.ZERO;
        int days = 250;
        double electricityConsume = 2.5;
        double fuelConsume = 6;
        double insuranceCost5Year = 7500;
        double maintenanceCost5Year = 5000;

        totalFeatureCost =totalFeatureCost.add(getFeatureCost("Safety and Driver Assistance", transitData.getSafetyDriverAssist()));
        totalFeatureCost = totalFeatureCost.add(getFeatureCost("Vehicle Health Monitoring", transitData.getVehicleHealth()));
        totalFeatureCost = totalFeatureCost.add(getFeatureCost("Smart Energy Management", transitData.getEnergyManagement()));
        totalFeatureCost = totalFeatureCost.add(getFeatureCost("Augmented Reality Navigation", transitData.getArNavigation()));
        totalFeatureCost = totalFeatureCost.add(getFeatureCost("Enhanced Entertainment Systems", transitData.getEntertainment()));
        totalFeatureCost = totalFeatureCost.add(getFeatureCost("Security and Anti-Theft Devices", transitData.getSecurity()));
     
        BigDecimal electricityCost = transitData.getElectricityCost() != null ? transitData.getElectricityCost() : BigDecimal.ZERO;
        
        BigDecimal fuelCost = transitData.getFuelCost() != null ? transitData.getFuelCost() : BigDecimal.ZERO;
        
        
        
        BigDecimal driverWages = transitData.getDriverWages() != null ? transitData.getDriverWages() : BigDecimal.ZERO;
        
        BigDecimal totalElectricity = ((BigDecimal.valueOf(transitData.getElectricVehicles())
        							   .multiply(BigDecimal.valueOf(transitData.getDistancePerVehicle())))
        							   .multiply(electricityCost)
        							   .multiply(BigDecimal.valueOf(days)))
        		 .divide(BigDecimal.valueOf(electricityConsume), 2, RoundingMode.HALF_UP);
        
        BigDecimal totalFuelCost = ((BigDecimal.valueOf(transitData.getFuelVehicles())
				   .multiply(BigDecimal.valueOf(transitData.getDistancePerVehicle())))
				   .multiply(fuelCost)
				   .multiply(BigDecimal.valueOf(days)))
        		.divide(BigDecimal.valueOf(fuelConsume), 2, RoundingMode.HALF_UP);
        
        BigDecimal totalVehicles = BigDecimal.valueOf(transitData.getFuelVehicles());
        totalVehicles = totalVehicles.add(BigDecimal.valueOf(transitData.getElectricVehicles()));
        
        BigDecimal totalDriverWages = driverWages.multiply(totalVehicles);
        BigDecimal insuranceCost = (BigDecimal.valueOf(insuranceCost5Year).divide(BigDecimal.valueOf(5)))
        							.multiply(totalVehicles);
        BigDecimal maintenanceCost = (BigDecimal.valueOf(maintenanceCost5Year).divide(BigDecimal.valueOf(5)))
        							.multiply(totalVehicles);
        
        
        BigDecimal totalOprationalCost = totalFeatureCost
        								.add(totalFuelCost)
        								.add(totalElectricity)
        								.add(insuranceCost)
        								.add(maintenanceCost)
        								.add(totalDriverWages);
        
        BigDecimal totalInvestment = transitData.getTotalInvestment() != null ? transitData.getTotalInvestment() : BigDecimal.ZERO;
        BigDecimal totalAvenue = transitData.getAvenue() != null ? transitData.getAvenue() : BigDecimal.ZERO;
     
        if (totalOprationalCost.compareTo(BigDecimal.ZERO) == 0) {
            return new ROICalculationTransit(BigDecimal.ZERO, totalOprationalCost, totalAvenue, totalInvestment); // Prevent division by zero
        }

        BigDecimal roi = ((totalAvenue.subtract(totalOprationalCost))
        				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
        
        BigDecimal year = BigDecimal.valueOf(transitData.getYear()) != null ? BigDecimal.valueOf(transitData.getYear()): BigDecimal.ZERO;
        BigDecimal yearRoi = roi.multiply(year);
        
        
        return new ROICalculationTransit(yearRoi, totalOprationalCost, totalAvenue, totalInvestment);
    }

    private BigDecimal getFeatureCost(String category, String description) {
    	PublicTransit feature = featureRepository.findByCategoryAndDescription(category, description);
        return feature != null ? feature.getAmount() : BigDecimal.ZERO;
    }
    

   
}
