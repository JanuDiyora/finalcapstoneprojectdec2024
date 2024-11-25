package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class PredictiveMaintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalInvestmentCost;
    private double annualOperatingCost;
    private double totalAnnualBenefits;
    private double downtimeHours;
    private double maintenanceCostSavings;
    private double roi;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }
}
