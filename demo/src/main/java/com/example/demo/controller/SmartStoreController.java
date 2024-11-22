package com.example.demo.controller;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class SmartStoreController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public String home() {
        return "home"; // Ensure "home.html" exists in the templates
    }

    @GetMapping("/category")
    public String showCategory(@RequestParam("category") String category, Model model) {
        List<Item> items = itemService.getItemsByCategory(category);
        model.addAttribute("items", items);
        model.addAttribute("categoryName", category); // Pass the category name
        return "category";
    }





    @PostMapping("/calculate-roi")
    public String calculateROI(
            @RequestParam("itemIds") List<Integer> itemIds,
            @RequestParam("quantities") List<Integer> quantities,
            @RequestParam("years") int years,
            Model model) {

        double totalCost = itemService.calculateTotalCost(itemIds, quantities);
        double totalRevenue = itemService.calculateRevenue(itemIds, quantities, years);
        double roiPercentage = (totalRevenue - totalCost) / totalCost * 100;

        model.addAttribute("totalCost", totalCost);
        model.addAttribute("totalRevenue", totalRevenue);
        model.addAttribute("roiPercentage", roiPercentage);

        return "roi-results"; // Ensure the "roi-results.html" template exists
    }
}
