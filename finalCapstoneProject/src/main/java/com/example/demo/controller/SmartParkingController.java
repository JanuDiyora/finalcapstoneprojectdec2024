package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ROICalculationParking;
import com.example.demo.model.SmartParking;
import com.example.demo.service.SmartParkingService;

@Controller
public class SmartParkingController {

    @Autowired
    private SmartParkingService publicTransitService;

    @PostMapping("/SmartParkingResult")
    public String submitForm(SmartParking transitData, Model model) {
    	 ROICalculationParking response = publicTransitService.calculateROI(transitData);
    	 model.addAttribute("roi", response.getRoi());
    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
    	    
    	 return "SmartParkingResult";  // Update this to the actual name of your result HTML page

    }

    @GetMapping("/publicParkingForm")
    public String showForm() {
        return "smartParkingForm";  // Name of your HTML file (publicTransit.html)
    }
}
