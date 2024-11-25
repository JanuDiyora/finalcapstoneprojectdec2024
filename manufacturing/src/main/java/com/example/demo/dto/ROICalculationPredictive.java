package com.example.demo.dto;

public class ROICalculationPredictive {
    private double totalInvestmentCost;
    private double annualOperatingCost;
    private double totalAnnualBenefits;
    private double downtimeHours;
    private double maintenanceCostSavings;

    // Getters and setters for all the fields

    public double getTotalInvestmentCost() {
        return totalInvestmentCost;
    }

    public void setTotalInvestmentCost(double totalInvestmentCost) {
        this.totalInvestmentCost = totalInvestmentCost;
    }

    public double getAnnualOperatingCost() {
        return annualOperatingCost;
    }

    public void setAnnualOperatingCost(double annualOperatingCost) {
        this.annualOperatingCost = annualOperatingCost;
    }

    public double getTotalAnnualBenefits() {
        return totalAnnualBenefits;
    }

    public void setTotalAnnualBenefits(double totalAnnualBenefits) {
        this.totalAnnualBenefits = totalAnnualBenefits;
    }

    public double getDowntimeHours() {
        return downtimeHours;
    }

    public void setDowntimeHours(double downtimeHours) {
        this.downtimeHours = downtimeHours;
    }

    public double getMaintenanceCostSavings() {
        return maintenanceCostSavings;
    }

    public void setMaintenanceCostSavings(double maintenanceCostSavings) {
        this.maintenanceCostSavings = maintenanceCostSavings;
    }
}
