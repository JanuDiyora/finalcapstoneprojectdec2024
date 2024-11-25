package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ROICalculationBuilding;
import com.example.demo.dto.ROICalculationResponse;
import com.example.demo.model.SmartBuildingInfra;
import com.example.demo.repository.BuildingInfraRepository;

@Service
public class BuildingInfraService {

    @Autowired
    private BuildingInfraRepository buldingrepo;
  

    public ROICalculationBuilding calculateROI(SmartBuildingInfra smartbuilding) {
BigDecimal totalInvestment = BigDecimal.ZERO;
    	
    	
    	BigDecimal numberOfBuilding =BigDecimal.valueOf( smartbuilding.getNumberOfBuilding());

        // Calculate total investment from smart home devices
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfmeter", smartbuilding.getNumberOfmeter()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfGym", smartbuilding.getNumberOfGym()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfPool", smartbuilding.getNumberOfPool()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfGarden", smartbuilding.getNumberOfGarden()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfhall", smartbuilding.getNumberOfhall()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfClubHouse", smartbuilding.getNumberOfClubHouse()));
        
        
        BigDecimal totalInvestmentform = BigDecimal.valueOf(smartbuilding.getTotalInvestment()) != null ? BigDecimal.valueOf(smartbuilding.getTotalInvestment()) : BigDecimal.ZERO;
        BigDecimal totalAvenue = BigDecimal.valueOf(smartbuilding.getAvenue()) != null ? BigDecimal.valueOf(smartbuilding.getAvenue()) : BigDecimal.ZERO;
        BigDecimal year = BigDecimal.valueOf(smartbuilding.getYear()) != null ? BigDecimal.valueOf(smartbuilding.getYear()) : BigDecimal.ZERO;		
        System.out.println("Avenue : " + totalAvenue );
        
        
        
      
        if (totalInvestment.compareTo(BigDecimal.ZERO) == 0) {
            return new ROICalculationBuilding(BigDecimal.ZERO, totalInvestment, totalAvenue, totalInvestmentform); // Prevent division by zero
        }

        BigDecimal roi = ((totalAvenue.subtract(totalInvestment))
        				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
        
//        BigDecimal roi = (totalInvestment.subtract(totalOprationalCost))
//                .divide(totalOprationalCost, RoundingMode.HALF_UP);
        
//        System.out.println("last before return total cost  " + totalFeatureCost);
        return new ROICalculationBuilding(roi.multiply(year), totalInvestment, totalAvenue, totalInvestmentform);
    }
    // Retrieve the SmartBuildingInfra object based on the device name
    public BigDecimal getDeviceCost(String deviceName, int numberOfMeter) {
    SmartBuildingInfra device = buldingrepo.findByDevice(deviceName);

    if (device == null) {
    	System.out.println("hi");
        // Handle the case where the device is not found
//        throw new ResourceNotFoundException("Device with name " + deviceName + " not found");
    }

    // Perform calculations or adjustments using the numberOfMeter, if needed
    BigDecimal cost = device.getCost();
    
    // If you need to factor in numberOfMeter (for example, multiply the cost by the number of meters)
    return cost.multiply(BigDecimal.valueOf(numberOfMeter));
}
    

   
}
