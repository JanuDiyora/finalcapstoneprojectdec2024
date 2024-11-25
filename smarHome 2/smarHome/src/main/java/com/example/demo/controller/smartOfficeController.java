package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.dto.ROICalculationOffice;
import com.example.demo.model.smartOffice;

@Controller
public class smartOfficeController {
    
    @Autowired
    private com.example.demo.service.smartOfficeService smartOfficeService;

    // Handles the POST request for ROI calculation and displays results
    @PostMapping("/officeResult")
    public String submitForm(smartOffice transitData, Model model) {
        ROICalculationOffice response = smartOfficeService.calculateROI(transitData);
        model.addAttribute("roi", response.getRoi());
        model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
        model.addAttribute("totalAvenue", response.getTotalAvenue());
        model.addAttribute("totalInvestment", response.getTotalInvestment());
        
        return "officeResult"; // Renders officeResult.html
    }

    // Handles the GET request to show the form
    @GetMapping("/smartOfficeForm")
    public String showForm() {
        return "smartOffice"; // Renders smartOffice.html
    }
}
