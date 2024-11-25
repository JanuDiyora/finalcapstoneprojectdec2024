package com.example.demo.controller;

import com.example.demo.dto.ROICalculationFactory;
import com.example.demo.model.SmartFactory;
import com.example.demo.service.SmartfactoryServioce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SmartFactoryController {

    @Autowired
    private SmartfactoryServioce smartfactoryServioce;

    @RequestMapping("/SmartFactory")
    public String home() {
        return "SmartFactory";
    }

    @PostMapping("/SmartFactoryresult")
    public String submitForm(@ModelAttribute SmartFactory smartFactoryData, Model model) {
        // Calculate ROI
        ROICalculationFactory roiCalculation = smartfactoryServioce.calculateROI(smartFactoryData);

        // Add attributes to the model to pass to the view
        model.addAttribute("roiPercentage", roiCalculation.getRoi());
        model.addAttribute("totalInvestment", roiCalculation.getTotalInvestment());
        model.addAttribute("operatingCost", roiCalculation.getOperatingCost());
        model.addAttribute("annualRevenue", roiCalculation.getAnnualRevenue());
        model.addAttribute("netBenefit", roiCalculation.getNetBenefit());

        // Return the result page
        return "SmartFactoryResult";
    }
}
