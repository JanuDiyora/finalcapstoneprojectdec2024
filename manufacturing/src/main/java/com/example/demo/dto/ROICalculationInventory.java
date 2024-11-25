package com.example.demo.dto;

public class ROICalculationInventory {

    private double roi;
    private double totalInvestment;
    private double operatingCost;
    private double annualRevenue;

    // Getters and Setters
    public double getRoi() { return roi; }
    public void setRoi(double roi) { this.roi = roi; }

    public double getTotalInvestment() { return totalInvestment; }
    public void setTotalInvestment(double totalInvestment) { this.totalInvestment = totalInvestment; }

    public double getOperatingCost() { return operatingCost; }
    public void setOperatingCost(double operatingCost) { this.operatingCost = operatingCost; }

    public double getAnnualRevenue() { return annualRevenue; }
    public void setAnnualRevenue(double annualRevenue) { this.annualRevenue = annualRevenue; }
}
