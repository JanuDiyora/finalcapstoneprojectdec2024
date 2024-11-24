package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ROICalculationElectric;
import com.example.demo.model.SmartElectricInfra;
import com.example.demo.repository.ElectricVehicleInfraRepository;
import com.example.demo.service.ElectricVehicleInfraService;





@Controller
public class SmartElectricInfraController {
	
	
    @Autowired
    private ElectricVehicleInfraService publicTransitService;

    @PostMapping("/electricVehiclesInfraResult")
    public String submitForm(SmartElectricInfra transitData, Model model) {
      
 
    	ROICalculationElectric response = publicTransitService.calculateROI(transitData);
    	 model.addAttribute("roi", response.getRoi());
    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
    	    
    	 return "electricVehiclesInfraResult";  // Update this to the actual name of your result HTML page

    }

    @GetMapping("/electricVehicleInfra")
    public String showForm() {
        return "electricVehicleInfra";  // Name of your HTML file (publicTransit.html)
    }
}
