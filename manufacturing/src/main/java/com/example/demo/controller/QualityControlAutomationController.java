package com.example.demo.controller;

import com.example.demo.dto.ROICalculationQualityControl;
import com.example.demo.model.QualityControl;
import com.example.demo.service.QualityControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/QualityControlAutomation")
public class QualityControlAutomationController {

    @Autowired
    private QualityControlService qualityControlService;

    // Show input form for quality control automation
    @GetMapping("/form")
    public String showForm() {
        return "QualityControlAutomation"; // The form page where users enter data
    }

    // Endpoint to submit a new inspection record
    @PostMapping("/QualityControlAutomationResult")
    public String submitQualityControl(@ModelAttribute QualityControl qualityControl, Model model) {
        // Save the quality control record
        qualityControlService.saveQualityControl(qualityControl);

        // Return a confirmation message with saved record details
        model.addAttribute("message", "Quality control record saved successfully!");
        model.addAttribute("qualityControl", qualityControl);
        return "QualityControlAutomationResult"; // The results page where we show the saved data
    }

    // Endpoint to retrieve all records
    @GetMapping("/all")
    public String getAllRecords(Model model) {
        List<QualityControl> records = qualityControlService.getAllRecords();
        model.addAttribute("records", records);
        return "quality-control-list"; // View to display the list of all records
    }

    
    
}
