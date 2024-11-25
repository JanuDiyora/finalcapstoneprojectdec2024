package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ROICalculationResponse;
import com.example.demo.model.smartHome;
import com.example.demo.repository.SmartHomeRepository;

@Service
public class smartHomeService {

    @Autowired
    private SmartHomeRepository featureRepository;

    public ROICalculationResponse calculateROI(smartHome transitData) {
    	
    	BigDecimal totalInvestment = BigDecimal.ZERO;
    	
    	
    	BigDecimal numberOfRooms =BigDecimal.valueOf( transitData.getRooms());

        // Calculate total investment from smart home devices
        totalInvestment = totalInvestment.add(getDeviceCost("robotVacuums", transitData.getRobotVacuums())).multiply(numberOfRooms);
        totalInvestment = totalInvestment.add(getDeviceCost("lawnMowers", transitData.getLawnMowers())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("smartBulbs", transitData.getSmartBulbs())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("switches", transitData.getSwitches())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("thermostats", transitData.getThermostats())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("ventSystems", transitData.getVentSystems())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("assistants", transitData.getAssistants())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("detectors", transitData.getDetectors())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("doorbells", transitData.getDoorbells())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("cameras", transitData.getCameras())).multiply(numberOfRooms);;
        totalInvestment = totalInvestment.add(getDeviceCost("locks", transitData.getLocks())).multiply(numberOfRooms);;

//        System.out.println("After all parameter : " + totalFeatureCost);
        
        // Ensure that none of the BigDecimal fields are null by providing defaults
        
        
        
        
       
        
        BigDecimal totalInvestmentform = transitData.getTotalInvestment() != null ? transitData.getTotalInvestment() : BigDecimal.ZERO;
        BigDecimal totalAvenue = transitData.getTotalAvenue() != null ? transitData.getTotalAvenue() : BigDecimal.ZERO;
        		
        System.out.println("Avenue : " + totalAvenue );
        
        
        
      
        if (totalInvestment.compareTo(BigDecimal.ZERO) == 0) {
            return new ROICalculationResponse(BigDecimal.ZERO, totalInvestment, totalAvenue, totalInvestmentform); // Prevent division by zero
        }

        BigDecimal roi = ((totalAvenue.subtract(totalInvestment))
        				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
        
//        BigDecimal roi = (totalInvestment.subtract(totalOprationalCost))
//                .divide(totalOprationalCost, RoundingMode.HALF_UP);
        
//        System.out.println("last before return total cost  " + totalFeatureCost);
        return new ROICalculationResponse(roi, totalInvestment, totalAvenue, totalInvestmentform);
    }

    private BigDecimal getDeviceCost(String deviceName, Integer quantity) {
        return featureRepository.findByDevice(deviceName).getCost()
                .multiply(BigDecimal.valueOf(quantity != null ? quantity : 0));
    }

    

   
}
