package com.example.demo.dto;

import java.math.BigDecimal;

public class ROICalculationFleet {
	  private BigDecimal roi;
	    private BigDecimal totalOperationalCost;
	    private BigDecimal totalAvenue;
	    private BigDecimal totalInvestment;

	    public ROICalculationFleet(BigDecimal roi, BigDecimal totalOperationalCost, BigDecimal totalAvenue, BigDecimal totalInvestment) {
	        this.roi = roi;
	        this.totalOperationalCost = totalOperationalCost;
	        this.totalAvenue = totalAvenue;
	        this.totalInvestment = totalInvestment;
	    }

	    // Getters and Setters
	    public BigDecimal getRoi() {
	        return roi;
	    }

	    public void setRoi(BigDecimal roi) {
	        this.roi = roi;
	    }

	    public BigDecimal getTotalOperationalCost() {
	        return totalOperationalCost;
	    }

	    public void setTotalOperationalCost(BigDecimal totalOperationalCost) {
	        this.totalOperationalCost = totalOperationalCost;
	    }

	    public BigDecimal getTotalAvenue() {
	        return totalAvenue;
	    }

	    public void setTotalAvenue(BigDecimal totalAvenue) {
	        this.totalAvenue = totalAvenue;
	    }

	    public BigDecimal getTotalInvestment() {
	        return totalInvestment;
	    }

	    public void setTotalInvestment(BigDecimal totalInvestment) {
	        this.totalInvestment = totalInvestment;
	    }

}
