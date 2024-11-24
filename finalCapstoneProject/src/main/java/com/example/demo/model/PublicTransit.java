package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "features")
public class PublicTransit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String category;

    private String description;

    private BigDecimal amount;

    // Default constructor
    public PublicTransit() {}

    // Constructor with parameters
    public PublicTransit(String category, String description, BigDecimal amount) {
        this.category = category;
        this.description = description;
        this.amount = amount;
    }


    private int electricVehicles;
    private int fuelVehicles;
    private int distancePerVehicle;

    private String vehicleHealth;
    private String safetyDriverAssist;
    private String energyManagement;
    private String arNavigation;
    private String entertainment;
    private String security;
    


    private BigDecimal fuelCost;
    private BigDecimal electricityCost;
    private BigDecimal insuranceCost;
    private BigDecimal totalInvestment;
    private BigDecimal avenue;
   


	public BigDecimal getAvenue() {
		return avenue;
	}

	public void setAvenue(BigDecimal avenue) {
		this.avenue = avenue;
	}


	private BigDecimal driverWages;

    private int year;

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

	public int getElectricVehicles() {
		return electricVehicles;
	}

	public void setElectricVehicles(int electricVehicles) {
		this.electricVehicles = electricVehicles;
	}

	public int getFuelVehicles() {
		return fuelVehicles;
	}

	public void setFuelVehicles(int fuelVehicles) {
		this.fuelVehicles = fuelVehicles;
	}

	public int getDistancePerVehicle() {
		return distancePerVehicle;
	}

	public void setDistancePerVehicle(int distancePerVehicle) {
		this.distancePerVehicle = distancePerVehicle;
	}

	public String getVehicleHealth() {
		return vehicleHealth;
	}

	public void setVehicleHealth(String vehicleHealth) {
		this.vehicleHealth = vehicleHealth;
	}

	public String getSafetyDriverAssist() {
		return safetyDriverAssist;
	}

	public void setSafetyDriverAssist(String safetyDriverAssist) {
		this.safetyDriverAssist = safetyDriverAssist;
	}

	public String getEnergyManagement() {
		return energyManagement;
	}

	public void setEnergyManagement(String energyManagement) {
		this.energyManagement = energyManagement;
	}

	public String getArNavigation() {
		return arNavigation;
	}

	public void setArNavigation(String arNavigation) {
		this.arNavigation = arNavigation;
	}

	public String getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(String entertainment) {
		this.entertainment = entertainment;
	}

	public String getSecurity() {
		return security;
	}

	public void setSecurity(String security) {
		this.security = security;
	}




	public BigDecimal getFuelCost() {
		return fuelCost;
	}

	public void setFuelCost(BigDecimal fuelCost) {
		this.fuelCost = fuelCost;
	}

	public BigDecimal getElectricityCost() {
		return electricityCost;
	}

	public void setElectricityCost(BigDecimal electricityCost) {
		this.electricityCost = electricityCost;
	}

//	public BigDecimal getInsuranceCost() {
//		return insuranceCost;
//	}
//
//	public void setInsuranceCost(BigDecimal insuranceCost) {
//		this.insuranceCost = insuranceCost;
//	}

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public BigDecimal getInsuranceCost() {
		return insuranceCost;
	}

	public void setInsuranceCost(BigDecimal insuranceCost) {
		this.insuranceCost = insuranceCost;
	}

	

    // Getters and setters
    
    
}
