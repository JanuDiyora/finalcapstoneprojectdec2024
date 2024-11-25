package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ROICalculationBuilding;
import com.example.demo.dto.ROICalculationHighway;
import com.example.demo.model.SmartBuildingInfra;
import com.example.demo.model.SmartHighwayInfra;
import com.example.demo.repository.BuildingInfraRepository;
import com.example.demo.service.BuildingInfraService;
import com.example.demo.service.HighwayInfraService;

@Controller
public class SmartHighwayController {
	
	
    @Autowired
    private HighwayInfraService buildingService;

    @PostMapping("/smartHighwayresult")
    public String submitForm(SmartHighwayInfra transitData, Model model) {
//    	ROICalculationHighway  = buildingService.calculateROI(transitData);
    	
      
 
    	 ROICalculationHighway response= buildingService.calculateROI(transitData);
    	 model.addAttribute("roi", response.getRoi());
    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
    	    
    	 return "smartHighwayResult";  // Update this to the actual name of your result HTML page

    }

    @GetMapping("/smartHighwayForm")
    public String showForm() {
        return "smartHighway";  // Name of your HTML file (publicTransit.html)
    }
}
