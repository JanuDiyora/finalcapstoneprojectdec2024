package com.example.demo.model;

import java.math.BigDecimal;

public class SmartFactory {
    private String factoryName;
    private BigDecimal investmentCost;
    private BigDecimal operatingCost;
    private BigDecimal annualRevenue;
    private BigDecimal roiPercentage;
    private int year;
    private int investmentPeriod;

    // Getters and Setters
    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public BigDecimal getInvestmentCost() {
        return investmentCost;
    }

    public void setInvestmentCost(BigDecimal investmentCost) {
        this.investmentCost = investmentCost;
    }

    public BigDecimal getOperatingCost() {
        return operatingCost;
    }

    public void setOperatingCost(BigDecimal operatingCost) {
        this.operatingCost = operatingCost;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public BigDecimal getRoiPercentage() {
        return roiPercentage;
    }

    public void setRoiPercentage(BigDecimal roiPercentage) {
        this.roiPercentage = roiPercentage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getInvestmentPeriod() {
        return investmentPeriod;
    }

    public void setInvestmentPeriod(int investmentPeriod) {
        this.investmentPeriod = investmentPeriod;
    }
}
