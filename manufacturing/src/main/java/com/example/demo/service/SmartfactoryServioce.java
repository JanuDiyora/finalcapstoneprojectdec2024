package com.example.demo.service;

import com.example.demo.dto.ROICalculationFactory;
import com.example.demo.model.SmartFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class SmartfactoryServioce {

    public ROICalculationFactory calculateROI(SmartFactory smartFactory) {
        // Ensure values are not null and default to zero if necessary
        BigDecimal investmentCost = smartFactory.getInvestmentCost() != null ? smartFactory.getInvestmentCost() : BigDecimal.ZERO;
        BigDecimal operatingCost = smartFactory.getOperatingCost() != null ? smartFactory.getOperatingCost() : BigDecimal.ZERO;
        BigDecimal annualRevenue = smartFactory.getAnnualRevenue() != null ? smartFactory.getAnnualRevenue() : BigDecimal.ZERO;

        // Calculate net benefit (Revenue - Operating Costs - Investment)
        BigDecimal netBenefit = annualRevenue.subtract(operatingCost).subtract(investmentCost);

        // Calculate ROI as (Net Benefit / Investment Cost) * 100
        BigDecimal roi = BigDecimal.ZERO;

        if (investmentCost.compareTo(BigDecimal.ZERO) != 0) {
            roi = netBenefit.divide(investmentCost, 2, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100));
        }

        // Optionally, you can adjust ROI based on machine type or other factors
        // For example, different machine types might have different ROI factors.
      

        // Return calculated ROI and other relevant details in a DTO
        return new ROICalculationFactory(
                roi,              // ROI Percentage
                investmentCost,   // Investment Cost
                operatingCost,    // Operating Cost
                annualRevenue,    // Annual Revenue
                netBenefit        // Net Benefit
        );
    }
}
