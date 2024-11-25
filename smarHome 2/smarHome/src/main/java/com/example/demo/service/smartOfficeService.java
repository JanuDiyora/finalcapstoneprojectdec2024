package com.example.demo.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dto.ROICalculationOffice;
import com.example.demo.model.smartOffice;
import com.example.demo.repository.SmartOfficeRepository;

@Service
public class smartOfficeService {
	
	 @Autowired
	    private SmartOfficeRepository smartOfficeRepo;

	    public ROICalculationOffice calculateROI(smartOffice transitDataOffice) {
	    	
	    	BigDecimal totalOfficeCost = BigDecimal.ZERO;
	    	
	    	BigDecimal numberOfRooms = BigDecimal.valueOf(transitDataOffice.getUnits());

	    	// Calculate total investment from smart office devices
	    	totalOfficeCost = totalOfficeCost.add(getOfficeCost("Smart HVAC System", transitDataOffice.getHvacDefault())).multiply(numberOfRooms);
	    	totalOfficeCost = totalOfficeCost.add(getOfficeCost("Voice-Controlled Assistants", transitDataOffice.getAssistantsDefault())).multiply(numberOfRooms);
	    	totalOfficeCost = totalOfficeCost.add(getOfficeCost("Smart Desks", transitDataOffice.getDesksDefault())).multiply(numberOfRooms);
	    	totalOfficeCost = totalOfficeCost.add(getOfficeCost("Smart Appliances", transitDataOffice.getAppliancesDefault())).multiply(numberOfRooms);
	    	totalOfficeCost = totalOfficeCost.add(getOfficeCost("Smart Water Management System", transitDataOffice.getWaterDefault())).multiply(numberOfRooms);

	    	  BigDecimal totalInvestmentform = transitDataOffice.getTotalInvestment() != null ? transitDataOffice.getTotalInvestment() : BigDecimal.ZERO;
	          BigDecimal totalAvenue = transitDataOffice.getTotalAvenue() != null ? transitDataOffice.getTotalAvenue() : BigDecimal.ZERO;
	          		
	          System.out.println("Avenue : " + totalAvenue );
	        
	      
	        if (totalOfficeCost.compareTo(BigDecimal.ZERO) == 0) {
	            return new ROICalculationOffice(BigDecimal.ZERO, totalOfficeCost, totalAvenue, totalInvestmentform); // Prevent division by zero
	        }

	        BigDecimal roi = ((totalAvenue.subtract(totalOfficeCost))
	        				  .divide(totalOfficeCost,2, RoundingMode.HALF_UP)).multiply(BigDecimal.valueOf(100));
	        
	        return new ROICalculationOffice(roi, totalOfficeCost, totalAvenue, totalInvestmentform);
	    }

	    public BigDecimal getOfficeCost(String name, int someValue) {
	        smartOffice office = smartOfficeRepo.findByName(name);
	        if (office == null) {
	            throw new IllegalArgumentException("No record found for name: " + name);
	        }
	        // Example logic with the second parameter
	        BigDecimal cost = office.getCost();
	        return cost.multiply(BigDecimal.valueOf(someValue)); // Adjust as needed
	    }

	    


}
