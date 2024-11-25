package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ROICalculationBuilding;
import com.example.demo.model.SmartBuildingInfra;
import com.example.demo.repository.BuildingInfraRepository;
import com.example.demo.service.BuildingInfraService;

@Controller
public class SmartBuildingController {
	
	
    @Autowired
    private BuildingInfraService buildingService;

    @PostMapping("/BuildingInfra")
    public String submitForm(SmartBuildingInfra transitData, Model model) {
      
 
    	ROICalculationBuilding response = buildingService.calculateROI(transitData);
    	 model.addAttribute("roi", response.getRoi());
    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
    	    
    	 return "BuildingInfraResult";  // Update this to the actual name of your result HTML page

    }

    @GetMapping("/smartBuildingForm")
    public String showForm() {
        return "smartBuilding";  // Name of your HTML file (publicTransit.html)
    }
}
