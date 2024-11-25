package com.example.demo.service;

import com.example.demo.dto.ROICalculationInventory;
import com.example.demo.model.SmartInventory;
import org.springframework.stereotype.Service;

@Service
public class SmartInventoryService {

    public ROICalculationInventory calculateROI(SmartInventory inventory) {
        double totalInvestment = inventory.getQuantity() * inventory.getUnitCost();
        double operatingCost = inventory.getReorderQuantity() * inventory.getUnitCost();
        double annualRevenue = totalInvestment * 1.5; // Assume revenue is 150% of investment for this example
        double roi = ((annualRevenue - (totalInvestment + operatingCost)) / (totalInvestment + operatingCost)) * 100;

        ROICalculationInventory roiCalculation = new ROICalculationInventory();
        roiCalculation.setRoi(roi);
        roiCalculation.setTotalInvestment(totalInvestment);
        roiCalculation.setOperatingCost(operatingCost);
        roiCalculation.setAnnualRevenue(annualRevenue);

        return roiCalculation;
    }
}
