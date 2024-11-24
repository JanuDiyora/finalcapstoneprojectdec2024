package com.example.demo.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ROICalculationTransit;
import com.example.demo.model.PublicTransit;
import com.example.demo.service.PublicTransitService;





@Controller
public class PublicTransitController {

    @Autowired
    private PublicTransitService publicTransitService;

    @PostMapping("/submit")
    public String submitForm(PublicTransit transitData, Model model) {
    	 ROICalculationTransit response = publicTransitService.calculateROI(transitData);
    	 model.addAttribute("roi", response.getRoi());
    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
    	    
    	 return "publicTransitResult";  // Update this to the actual name of your result HTML page

    }

    @GetMapping("/publicTransitform")
    public String showForm() {
        return "publicTransitForm";  // Name of your HTML file (publicTransit.html)
    }
}
