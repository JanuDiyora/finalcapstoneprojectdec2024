package com.example.demo.controller;

import com.example.demo.dto.ROICalculationPredictive;
import com.example.demo.model.PredictiveMaintenance;
import com.example.demo.service.PredictiveMaintenanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/Predictive-main")
public class PredictiveMaintenanceController {

    private final PredictiveMaintenanceService service;

    public PredictiveMaintenanceController(PredictiveMaintenanceService service) {
        this.service = service;
    }

    // Show input form
    @GetMapping
    public String showForm() {
        return "Predictive-main"; // The form page where users enter data
    }

    // Handle form submission and calculate ROI
    @PostMapping("/Predictive-mainResult")
    public String calculateROI(@ModelAttribute ROICalculationPredictive dto, Model model) {
        // Calculate ROI using service logic
        PredictiveMaintenance result = service.calculateROI(dto);
        
        // Add attributes to the model to display on the results page
        model.addAttribute("totalInvestment", result.getTotalInvestmentCost());
        model.addAttribute("annualOperatingCost", result.getAnnualOperatingCost());
        model.addAttribute("totalAnnualBenefits", result.getTotalAnnualBenefits());
        model.addAttribute("downtimeHours", result.getDowntimeHours());
        model.addAttribute("maintenanceCostSavings", result.getMaintenanceCostSavings());
        model.addAttribute("roiPercentage", result.getRoi());
        
        // Return the view name for the result page
        return "Predictive-mainResult"; // Make sure this matches the name of your results template
    }
}
