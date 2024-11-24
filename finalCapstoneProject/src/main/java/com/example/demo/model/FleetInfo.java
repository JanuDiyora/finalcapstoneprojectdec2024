package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "fleet")
public class FleetInfo {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    private String category;

	    private String description;

	    private BigDecimal amount;

	    // Default constructor
	    public FleetInfo() {}

	    // Constructor with parameters
	    public FleetInfo(String category, String description, BigDecimal amount) {
	        this.category = category;
	        this.description = description;
	        this.amount = amount;
	    }

	    private int heavyVehicles;
	    private int lightVehicles;
	    private int distancePerVehicle;
	    
	    private String arNavigation;
	    private String security;
	    
	    private BigDecimal hos;

	    

	    private BigDecimal fuelCost;
	    private BigDecimal avenue;
	    private BigDecimal totalInvestment;
		private BigDecimal driverWages;
	    
	    
	    
	    private BigDecimal year;

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

		
		
		
		public int getLightVehicles() {
			return lightVehicles;
		}

		public void setLightVehicles(int lightVehicles) {
			this.lightVehicles = lightVehicles;
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

		public int getHeavyVehicles() {
			return heavyVehicles;
		}

		public void setHeavyVehicles(int heavyVehicles) {
			this.heavyVehicles = heavyVehicles;
		}

		

		public int getDistancePerVehicle() {
			return distancePerVehicle;
		}

		public void setDistancePerVehicle(int distancePerVehicle) {
			this.distancePerVehicle = distancePerVehicle;
		}

		public String getArNavigation() {
			return arNavigation;
		}

		public void setArNavigation(String arNavigation) {
			this.arNavigation = arNavigation;
		}

		public String getSecurity() {
			return security;
		}

		public void setSecurity(String security) {
			this.security = security;
		}

		public BigDecimal getHos() {
			return hos;
		}

		public void setHos(BigDecimal hos) {
			this.hos = hos;
		}

		

		public BigDecimal getFuelCost() {
			return fuelCost;
		}

		public void setFuelCost(BigDecimal fuelCost) {
			this.fuelCost = fuelCost;
		}

		public BigDecimal getAvenue() {
			return avenue;
		}

		public void setAvenue(BigDecimal avenue) {
			this.avenue = avenue;
		}

		public BigDecimal getTotalInvestment() {
			return totalInvestment;
		}

		public void setTotalInvestment(BigDecimal totalInvestment) {
			this.totalInvestment = totalInvestment;
		}

		public BigDecimal getDriverWages() {
			return driverWages;
		}

		public void setDriverWages(BigDecimal driverWages) {
			this.driverWages = driverWages;
		}

		public BigDecimal getYear() {
			return year;
		}

		public void setYear(BigDecimal year) {
			this.year = year;
		}

		
	    
	    
	    
}
