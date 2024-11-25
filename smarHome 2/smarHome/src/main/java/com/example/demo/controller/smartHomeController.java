package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ROICalculationResponse;
import com.example.demo.model.smartHome;
import com.example.demo.service.smartHomeService;

@Controller
public class smartHomeController {
	
	  @Autowired
	    private smartHomeService publicTransitService;

	    @PostMapping("/submit")
	    public String submitForm(smartHome transitData, Model model) {
	    	 ROICalculationResponse response = publicTransitService.calculateROI(transitData);
	    	 model.addAttribute("roi", response.getRoi());
	    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
	    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
	    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
	    	    
	    	 return "result";
	    }

	    @GetMapping("/form")
	    public String showForm() {
	        return "smartHome"; // i will tell you later if your code run perfectly, then....
	    }

}
