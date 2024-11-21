package com.example.demo.controller;

import com.example.demo.dto.ROIRequest;
import com.example.demo.model.SmartStore;
import com.example.demo.service.SmartStoreService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class SmartStoreController {

    private final SmartStoreService smartStoreService;

    public SmartStoreController(SmartStoreService smartStoreService) {
        this.smartStoreService = smartStoreService;
    }

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("/category")
    public String showCategory(@RequestParam("category") String category, Model model) {
        List<SmartStore> devices = smartStoreService.getDevicesByCategory(category);
        model.addAttribute("category", category);
        model.addAttribute("devices", devices);
        return "category";
    }

    @PostMapping("/calculate-roi")
    public ResponseEntity<Map<String, Object>> calculateROI(@RequestBody ROIRequest roiRequest) {
        double totalCost = 10000.0;
        List<Integer> quantities = roiRequest.getQuantities();
        double totalRevenue = smartStoreService.calculateRevenue(roiRequest.getCategory(), quantities);

        double netReturn = totalRevenue - totalCost;
        double roiPercentage = (netReturn / totalCost) * 100;

        Map<String, Object> response = new HashMap<>();
        response.put("totalCost", totalCost);
        response.put("totalRevenue", totalRevenue);
        response.put("netReturn", netReturn);
        response.put("roiPercentage", roiPercentage);

        return ResponseEntity.ok(response);
    }
}
