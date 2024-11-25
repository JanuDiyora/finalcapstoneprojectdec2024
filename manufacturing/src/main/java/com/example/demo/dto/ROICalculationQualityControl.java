package com.example.demo.dto;

import com.example.demo.model.QualityControl;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ROICalculationQualityControl {

    public static double calculateROI(QualityControl qc) {
        if (qc.getInvestmentCost() == null || qc.getAnnualBenefits() == null || qc.getOperatingCost() == null) {
            throw new IllegalArgumentException("Investment cost, operating cost, and annual benefits must not be null.");
        }

        // Calculate total cost (investment cost + operating cost)
        BigDecimal totalCost = qc.getInvestmentCost().add(qc.getOperatingCost());

        if (totalCost.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("Total cost must not be zero.");
        }

        // Calculate ROI as (annual benefits / total cost) * 100
        BigDecimal roi = qc.getAnnualBenefits()
                .divide(totalCost, 2, RoundingMode.HALF_UP) // Dividing with scale and rounding
                .multiply(BigDecimal.valueOf(100)); // Multiply by 100 for percentage

        return roi.doubleValue();
    }
}
