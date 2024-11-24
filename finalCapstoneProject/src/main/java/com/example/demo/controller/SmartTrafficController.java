package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ROICalculationTraffic;
import com.example.demo.model.SmartTraffic;
import com.example.demo.service.SmartTrafficService;

@Controller
public class SmartTrafficController {

    @Autowired
    private SmartTrafficService publicTransitService;

    @PostMapping("/smartTrafficResult")
    public String submitForm(SmartTraffic transitData, Model model) {
    	 ROICalculationTraffic response = publicTransitService.calculateROI(transitData);
    	 model.addAttribute("roi", response.getRoi());
    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
    	    
    	 return "smartTrafficResult";  // Update this to the actual name of your result HTML page

    }

    @GetMapping("/smartTrafiicForm")
    public String showForm() {
        return "smartTrafiicForm";  // Name of your HTML file (publicTransit.html)
    }
}
