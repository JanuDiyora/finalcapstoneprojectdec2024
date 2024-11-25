package com.example.demo.dto;

import java.math.BigDecimal;

public class ROICalculationFactory {
    private BigDecimal roi;
    private BigDecimal totalInvestment;
    private BigDecimal operatingCost;
    private BigDecimal annualRevenue;
    private BigDecimal netBenefit;

    public ROICalculationFactory(BigDecimal roi, BigDecimal totalInvestment, BigDecimal operatingCost, BigDecimal annualRevenue, BigDecimal netBenefit) {
        this.roi = roi;
        this.totalInvestment = totalInvestment;
        this.operatingCost = operatingCost;
        this.annualRevenue = annualRevenue;
        this.netBenefit = netBenefit;
    }

    public BigDecimal getRoi() {
        return roi;
    }

    public BigDecimal getTotalInvestment() {
        return totalInvestment;
    }

    public BigDecimal getOperatingCost() {
        return operatingCost;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public BigDecimal getNetBenefit() {
        return netBenefit;
    }
}
