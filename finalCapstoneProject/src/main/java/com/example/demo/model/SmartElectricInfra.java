package com.example.demo.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "selected_devices")
public class SmartElectricInfra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "device_name")  // Ensure column name matches the database column
    private String deviceName;
    
    private BigDecimal amount;

    // Default constructor
    public SmartElectricInfra() {}

    // Constructor with parameters
    public SmartElectricInfra(String deviceName,BigDecimal amount) {
    	this.deviceName = deviceName;
        this.amount = amount;
    }

    private int smartChargingStation;
    private int numberOfEquipments;
    private List<String> devices;
    
    private int avenue;
    private int totalInvestment;
    private int year;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDevice_name() {
		return deviceName;
	}

	public void setDevice_name(String deviceName) {
		this.deviceName = deviceName;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	

	public int getSmartChargingStation() {
		return smartChargingStation;
	}

	public void setSmartChargingStation(int smartChargingStation) {
		this.smartChargingStation = smartChargingStation;
	}

	public int getNumberOfEquipments() {
		return numberOfEquipments;
	}

	public void setNumberOfEquipments(int numberOfEquipments) {
		this.numberOfEquipments = numberOfEquipments;
	}

	public List<String> getDevices() {
		return devices;
	}

	public void setDevices(List<String> devices) {
		this.devices = devices;
	}

	public int getAvenue() {
		return avenue;
	}

	public void setAvenue(int avenue) {
		this.avenue = avenue;
	}

	public int getTotalInvestment() {
		return totalInvestment;
	}

	public void setTotalInvestment(int totalInvestment) {
		this.totalInvestment = totalInvestment;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
    
    
}
