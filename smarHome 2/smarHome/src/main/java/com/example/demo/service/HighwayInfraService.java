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
import com.example.demo.dto.ROICalculationHighway;
import com.example.demo.dto.ROICalculationResponse;
import com.example.demo.model.SmartBuildingInfra;
import com.example.demo.model.SmartHighwayInfra;
import com.example.demo.repository.BuildingInfraRepository;
import com.example.demo.repository.HighwayInfraRepository;

@Service
public class HighwayInfraService {

    @Autowired
    private HighwayInfraRepository buldingrepo;
  

    public ROICalculationHighway calculateROI(SmartHighwayInfra smartbuilding) {
BigDecimal totalInvestment = BigDecimal.ZERO;
    	
    	

        // Calculate total investment from smart home devices
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfsmartMang", smartbuilding.getNumberOfsmartMang()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOflightSys", smartbuilding.getNumberOflightSys()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfcctv", smartbuilding.getNumberOfcctv()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfVehicleCom", smartbuilding.getNumberOfVehicleCom()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfSolarPanel", smartbuilding.getNumberOfSolarPanel()));
        totalInvestment = totalInvestment.add(getDeviceCost("numberOfDisplay", smartbuilding.getNumberOfDisplay()));
        
        
        BigDecimal totalInvestmentform = BigDecimal.valueOf(smartbuilding.getTotalInvestment()) != null ? BigDecimal.valueOf(smartbuilding.getTotalInvestment()) : BigDecimal.ZERO;
        BigDecimal totalAvenue = BigDecimal.valueOf(smartbuilding.getAvenue()) != null ? BigDecimal.valueOf(smartbuilding.getAvenue()) : BigDecimal.ZERO;
        BigDecimal year = BigDecimal.valueOf(smartbuilding.getYear()) != null ? BigDecimal.valueOf(smartbuilding.getYear()) : BigDecimal.ZERO;		

        
        
        
      
        if (totalInvestment.compareTo(BigDecimal.ZERO) == 0) {
            return new ROICalculationHighway(BigDecimal.ZERO, totalInvestment, totalAvenue, totalInvestmentform); // Prevent division by zero
        }

        BigDecimal roi = ((totalAvenue.subtract(totalInvestment))
        				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
        
//        BigDecimal roi = (totalInvestment.subtract(totalOprationalCost))
//                .divide(totalOprationalCost, RoundingMode.HALF_UP);
        
//        System.out.println("last before return total cost  " + totalFeatureCost);
        return new ROICalculationHighway(roi.multiply(year), totalInvestment, totalAvenue, totalInvestmentform);
    }
    // Retrieve the SmartBuildingInfra object based on the device name
    public BigDecimal getDeviceCost(String deviceName, int numberOfMeter) {
    SmartHighwayInfra device = buldingrepo.findByDevice(deviceName);

    if (device == null) {
    	//
    }

    // Perform calculations or adjustments using the numberOfMeter, if needed
    BigDecimal cost = device.getCost();
    
    // If you need to factor in numberOfMeter (for example, multiply the cost by the number of meters)
    return cost.multiply(BigDecimal.valueOf(numberOfMeter));
}
    

   
}
