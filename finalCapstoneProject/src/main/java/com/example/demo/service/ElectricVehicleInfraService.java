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

import com.example.demo.dto.ROICalculationElectric;
import com.example.demo.model.SmartElectricInfra;
import com.example.demo.repository.ElectricVehicleInfraRepository;

@Service
public class ElectricVehicleInfraService {

    @Autowired
    private ElectricVehicleInfraRepository featureRepository;
    public BigDecimal getDeviceCost(String deviceName) {
        Optional<SmartElectricInfra> deviceCostOptional = featureRepository.findByDeviceName(deviceName);
        
        return deviceCostOptional.map(SmartElectricInfra::getAmount).orElse(BigDecimal.ZERO);
    }


    public ROICalculationElectric calculateROI(SmartElectricInfra transitData) {
    	
    		
    	List<String> selectedDevices = transitData.getDevices();
    	System.out.println(selectedDevices);

    	  BigDecimal numberOfCharginStations = BigDecimal.valueOf(transitData.getSmartChargingStation()) != null ? BigDecimal.valueOf(transitData.getSmartChargingStation()): BigDecimal.ZERO;
    	  BigDecimal numberOfequipment = BigDecimal.valueOf(transitData.getNumberOfEquipments()) != null ? BigDecimal.valueOf(transitData.getNumberOfEquipments()): BigDecimal.ZERO;    	  
    	  BigDecimal totalAvenue = BigDecimal.valueOf(transitData.getAvenue()) != null ? BigDecimal.valueOf(transitData.getAvenue()): BigDecimal.ZERO;
    	  BigDecimal totalInvestment = BigDecimal.valueOf(transitData.getTotalInvestment()) != null ? BigDecimal.valueOf(transitData.getTotalInvestment()): BigDecimal.ZERO;
    	  BigDecimal year = BigDecimal.valueOf(transitData.getYear()) != null ? BigDecimal.valueOf(transitData.getYear()): BigDecimal.ZERO;
    	  
    	 
    	  BigDecimal totalEquipment =  numberOfCharginStations.multiply(numberOfequipment);
    	  
    	  BigDecimal totalOperationalCost = selectedDevices.stream()
    		        .map(deviceName -> {
    		            // Get the cost of the device from the DB and multiply by the equipment count
    		            BigDecimal deviceCost = getDeviceCost(deviceName.trim()); 
    		            System.out.println(deviceName.trim());
    		            System.out.println(deviceCost);
    		            return deviceCost.multiply(totalEquipment);  // Multiply by the number of equipment
    		        }) .reduce(BigDecimal.ZERO, BigDecimal::add);  
    
    	  
    	  if (totalOperationalCost.compareTo(BigDecimal.ZERO) == 0) {
              return new ROICalculationElectric(BigDecimal.ZERO, totalOperationalCost, totalAvenue, totalInvestment); // Prevent division by zero
          }

          BigDecimal roi = ((totalAvenue.subtract(totalOperationalCost))
          				  .divide(totalInvestment,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
          BigDecimal yearRoi = roi.multiply(year);
          return new ROICalculationElectric(yearRoi, totalOperationalCost, totalAvenue, totalInvestment);
    }
  }