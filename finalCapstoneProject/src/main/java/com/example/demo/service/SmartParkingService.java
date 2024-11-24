package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ROICalculationParking;
import com.example.demo.dto.ROICalculationParking;
import com.example.demo.model.SmartParking;


@Service
public class SmartParkingService {


    public ROICalculationParking calculateROI(SmartParking form) {
        // Example calculation (modify as per actual requirements)
    		 int sensorCost = 650;
    		 int gatewayCost = 1500;
    		 int costofdynamicDisplay = 1900;
    		 
    		 BigDecimal totalSpots = form.getSensors().multiply(BigDecimal.valueOf(2));
    		 
    		 BigDecimal totalSensorCost = form.getSensors().multiply(BigDecimal.valueOf(sensorCost));
    		 BigDecimal totalGatewaysCost = form.getGateways().multiply(BigDecimal.valueOf(gatewayCost));
    		 BigDecimal totalPanelsCost = form.getPanels().multiply(BigDecimal.valueOf(costofdynamicDisplay));
    		 
    		 BigDecimal getSensorCost = form.getSensorInstallation()!= null ? form.getSensorInstallation() : BigDecimal.ZERO;
    		 BigDecimal getGatewayCost = form.getGatewayInstallation()!= null ? form.getGatewayInstallation() : BigDecimal.ZERO;
    		 BigDecimal getPanelCost = form.getPanelInstallation()!= null ? form.getPanelInstallation() : BigDecimal.ZERO;
    		 
    		 BigDecimal installmentSensorCost = form.getSensors().multiply(getSensorCost);
    		 BigDecimal installmentGatewaysCost = form.getGateways().multiply(getGatewayCost);
    		 BigDecimal installmentPanelsCost = form.getPanels().multiply(getPanelCost);
    		 
    		 BigDecimal totalEuipmentCost = totalGatewaysCost.add(totalPanelsCost).add(totalSensorCost);
    		 BigDecimal totalOperatingCost = form.getCostSpot().multiply(totalSpots).multiply(BigDecimal.valueOf(12));
    		 BigDecimal totalInstallmentCost = installmentSensorCost.add(installmentGatewaysCost).add(installmentPanelsCost);
    		 
    		 BigDecimal totalOprationalCost = totalEuipmentCost.add(totalOperatingCost).add(totalInstallmentCost);
    		 
    		 BigDecimal totalInvestment = form.getTotalInvestment()!= null ? form.getTotalInvestment() : BigDecimal.ZERO;
    	     BigDecimal totalAvenue = form.getAvenue() != null ? form.getAvenue() : BigDecimal.ZERO;
    		 if (totalOprationalCost.compareTo(BigDecimal.ZERO) == 0) {
    	            return new ROICalculationParking(BigDecimal.ZERO, totalOprationalCost, totalAvenue, totalInvestment); // Prevent division by zero
    	        }
    	        BigDecimal roi = ((totalAvenue.subtract(totalOprationalCost))
    	        				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
    	    
    	        BigDecimal year = BigDecimal.valueOf(form.getYear()) != null ? BigDecimal.valueOf(form.getYear()): BigDecimal.ZERO;
    	        BigDecimal yearRoi = roi.multiply(year);
    	       
    	        
    	        return new ROICalculationParking(yearRoi, totalOprationalCost, totalAvenue, totalInvestment);

    
    }
    

   
}
