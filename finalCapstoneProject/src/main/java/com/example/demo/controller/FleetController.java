package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dto.ROICalculationFleet;
import com.example.demo.model.FleetInfo;
import com.example.demo.service.FleetService;

@Controller
@RequestMapping("/fleet")
public class FleetController {
	 @Autowired
	    private FleetService fleetSevice;

	    @PostMapping("/calculate")
	    public String submitForm(FleetInfo transitData, Model model) {
	    	 ROICalculationFleet response = fleetSevice.calculateROI(transitData);
	    	 model.addAttribute("roi", response.getRoi());
	    	 model.addAttribute("totalOperationalCost", response.getTotalOperationalCost());
	    	 model.addAttribute("totalAvenue", response.getTotalAvenue());
	    	 model.addAttribute("totalInvestment", response.getTotalInvestment());
	    	    
	    	 return "fleetResult";  // Update this to the actual name of your result HTML page

	    }

	    @GetMapping("/fleetform")
	    public String showForm() {
	        return "fleetForm";  // Name of your HTML file (publicTransit.html)
	    }
}
