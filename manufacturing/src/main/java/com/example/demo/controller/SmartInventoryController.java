package com.example.demo.controller;

import com.example.demo.dto.ROICalculationInventory;
import com.example.demo.model.SmartInventory;
import com.example.demo.service.SmartInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SmartInventoryController {

    @Autowired
    private SmartInventoryService smartInventoryService;

    // Handle form submission and calculate ROI for inventory items
    @PostMapping("/SmartInventoryResult")
    public String submitForm(SmartInventory smartInventoryData, Model model) {

        // Calculate the ROI using the service method
        ROICalculationInventory roiCalculation = smartInventoryService.calculateROI(smartInventoryData);

        // Add attributes to the model for the result page
        model.addAttribute("roiPercentage", roiCalculation.getRoi());  // ROI percentage
        model.addAttribute("totalInvestment", roiCalculation.getTotalInvestment());  // Total investment costs
        model.addAttribute("operatingCost", roiCalculation.getOperatingCost());  // Total operating costs
        model.addAttribute("annualRevenue", roiCalculation.getAnnualRevenue());  // Total annual revenue

        return "SmartInventoryResult";  // Return the name of the result page
    }

    // Display the form for SmartInventory
    @GetMapping("/SmartInventory")
    public String showForm() {
        return "SmartInventory";  // Return the name of the form page
    }
}
