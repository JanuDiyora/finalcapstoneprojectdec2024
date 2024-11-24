package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "trafic")
public class SmartTraffic {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String category;

	    private String description;

	    private BigDecimal amount;

	    // Default constructor
	    public SmartTraffic() {}

	    // Constructor with parameters
	    public SmartTraffic(String category, String description, BigDecimal amount) {
	        this.category = category;
	        this.description = description;
	        this.amount = amount;
	    }
	    
	    private int intersections;
	    private int co2Before;
	    private int co2After;
	    
	    private int carbonCredit;
	    private int fuelPrice;
	    private int governmentSubsidy;
	    
	    private int totalInvestment;
	    private int avenue;
	    private int year;

	    private String technology;
	    private String sensorType;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public BigDecimal getAmount() {
			return amount;
		}

		public void setAmount(BigDecimal amount) {
			this.amount = amount;
		}

		public int getIntersections() {
			return intersections;
		}

		public void setIntersections(int intersections) {
			this.intersections = intersections;
		}

		public int getCo2Before() {
			return co2Before;
		}

		public void setCo2Before(int co2Before) {
			this.co2Before = co2Before;
		}

		public int getCo2After() {
			return co2After;
		}

		public void setCo2After(int co2After) {
			this.co2After = co2After;
		}

		public int getCarbonCredit() {
			return carbonCredit;
		}

		public void setCarbonCredit(int carbonCredit) {
			this.carbonCredit = carbonCredit;
		}

		public int getFuelPrice() {
			return fuelPrice;
		}

		public void setFuelPrice(int fuelPrice) {
			this.fuelPrice = fuelPrice;
		}

		public int getGovernmentSubsidy() {
			return governmentSubsidy;
		}

		public void setGovernmentSubsidy(int governmentSubsidy) {
			this.governmentSubsidy = governmentSubsidy;
		}

		public int getTotalInvestment() {
			return totalInvestment;
		}

		public void setTotalInvestment(int totalInvestment) {
			this.totalInvestment = totalInvestment;
		}

		public int getAvenue() {
			return avenue;
		}

		public void setAvenue(int avenue) {
			this.avenue = avenue;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public String getTechnology() {
			return technology;
		}

		public void setTechnology(String technology) {
			this.technology = technology;
		}

		public String getSensorType() {
			return sensorType;
		}

		public void setSensorType(String sensorType) {
			this.sensorType = sensorType;
		}

		
	    
	
}
