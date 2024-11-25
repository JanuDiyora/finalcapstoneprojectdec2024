package com.example.demo.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class QualityControl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int inspectionId;

    private String inspectionType;
    private int defectCount;
    private String defectType;
    private String passFailStatus;

    private BigDecimal investmentCost; // Total investment cost
    private BigDecimal operatingCost; // Operating cost
    private BigDecimal annualBenefits; // Annual benefits
    private BigDecimal downtimeHoursSaved; // Downtime hours saved
    private BigDecimal maintenanceCostSavings; // Maintenance cost savings

    // Getters and Setters
    public int getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(int inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(String inspectionType) {
        this.inspectionType = inspectionType;
    }

    public int getDefectCount() {
        return defectCount;
    }

    public void setDefectCount(int defectCount) {
        this.defectCount = defectCount;
    }

    public String getDefectType() {
        return defectType;
    }

    public void setDefectType(String defectType) {
        this.defectType = defectType;
    }

    public String getPassFailStatus() {
        return passFailStatus;
    }

    public void setPassFailStatus(String passFailStatus) {
        this.passFailStatus = passFailStatus;
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

    public BigDecimal getAnnualBenefits() {
        return annualBenefits;
    }

    public void setAnnualBenefits(BigDecimal annualBenefits) {
        this.annualBenefits = annualBenefits;
    }

    public BigDecimal getDowntimeHoursSaved() {
        return downtimeHoursSaved;
    }

    public void setDowntimeHoursSaved(BigDecimal downtimeHoursSaved) {
        this.downtimeHoursSaved = downtimeHoursSaved;
    }

    public BigDecimal getMaintenanceCostSavings() {
        return maintenanceCostSavings;
    }

    public void setMaintenanceCostSavings(BigDecimal maintenanceCostSavings) {
        this.maintenanceCostSavings = maintenanceCostSavings;
    }
}
