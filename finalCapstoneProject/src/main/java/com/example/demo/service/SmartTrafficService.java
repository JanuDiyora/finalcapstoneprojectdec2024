package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.ROICalculationTraffic;
import com.example.demo.model.SmartTraffic;
import com.example.demo.repository.SmartTrafficRepository;

@Service
public class SmartTrafficService {

    @Autowired
    private SmartTrafficRepository featureRepository;

    public ROICalculationTraffic calculateROI(SmartTraffic form) {
    	 // Fetch the features for different categories
        BigDecimal totalOprationalCost = BigDecimal.ZERO;
        double days = 250; 
        double ideleReductoin = 1;
        double numberOfVehicle = 5000;
        double avgFuelConsumption = 0.5;
        		

        BigDecimal numberOfIntersections = BigDecimal.valueOf(form.getIntersections()) != null ? BigDecimal.valueOf(form.getIntersections()) : BigDecimal.ZERO;
        totalOprationalCost =(totalOprationalCost.add(getFeatureCost("Technology", form.getTechnology()))).multiply(numberOfIntersections);
        BigDecimal totalSensorCost = getFeatureCost("Type of Sensor", form.getSensorType()).multiply(numberOfIntersections);
        totalOprationalCost = (totalOprationalCost.add(totalSensorCost));
             
        BigDecimal fuelCost = BigDecimal.valueOf(form.getFuelPrice()) != null ? BigDecimal.valueOf(form.getFuelPrice()) : BigDecimal.ZERO;
        
        BigDecimal co2Before = BigDecimal.valueOf(form.getCo2Before()) != null ? BigDecimal.valueOf(form.getCo2Before()) : BigDecimal.ZERO;
        BigDecimal co2After = BigDecimal.valueOf(form.getCo2After()) != null ? BigDecimal.valueOf(form.getCo2After()) : BigDecimal.ZERO;
        BigDecimal carbonCredit = BigDecimal.valueOf(form.getCarbonCredit()) != null ? BigDecimal.valueOf(form.getCarbonCredit()) : BigDecimal.ZERO;
      
        BigDecimal governmentSubsidy = BigDecimal.valueOf(form.getGovernmentSubsidy()) != null ? BigDecimal.valueOf(form.getGovernmentSubsidy()) : BigDecimal.ZERO;

        BigDecimal totalInvestment = BigDecimal.valueOf(form.getTotalInvestment()) != null ? BigDecimal.valueOf(form.getTotalInvestment()) : BigDecimal.ZERO;
        BigDecimal totalAvenue = BigDecimal.valueOf(form.getAvenue()) != null ? BigDecimal.valueOf(form.getAvenue()) : BigDecimal.ZERO;
        
        BigDecimal year = BigDecimal.valueOf(form.getYear()) != null ? BigDecimal.valueOf(form.getYear()) : BigDecimal.ZERO;        
        
        BigDecimal carbonIncentive = (co2Before.subtract(co2After)).multiply(carbonCredit);
        BigDecimal fuelSavingCost = (BigDecimal.valueOf(numberOfVehicle).multiply(BigDecimal.valueOf(avgFuelConsumption))
        							.multiply(BigDecimal.valueOf(ideleReductoin)).multiply(BigDecimal.valueOf(days).multiply(year))).multiply(fuelCost);
        
        
        BigDecimal environmentalIncentive = carbonIncentive.add(fuelSavingCost).add(governmentSubsidy);
        BigDecimal totalOprationalNewCost = totalOprationalCost.subtract(environmentalIncentive);       
             
        if (totalOprationalNewCost.compareTo(BigDecimal.ZERO) == 0) {
            return new ROICalculationTraffic(BigDecimal.ZERO, totalOprationalNewCost, totalAvenue, totalInvestment); // Prevent division by zero
        }

        BigDecimal roi = ((totalAvenue.subtract(totalOprationalNewCost))
        				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
        
        return new ROICalculationTraffic(roi, totalOprationalNewCost, totalAvenue, totalInvestment);
    }
    
    private BigDecimal getFeatureCost(String category, String description) {
    	SmartTraffic feature = featureRepository.findByCategoryAndDescription(category, description);
        return feature != null ? feature.getAmount() : BigDecimal.ZERO;
    }
    
    

   
}
