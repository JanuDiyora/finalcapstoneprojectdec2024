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
@Table(name = "highway")
public class SmartHighwayInfra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")  // Ensure column name matches the database column
    private String device;
    
    private BigDecimal cost;

    // Default constructor
    public SmartHighwayInfra() {}

    // Constructor with parameters
    public SmartHighwayInfra(String device,BigDecimal cost) {
    	this.device = device;
        this.cost = cost;
    }

    private int numberOfsmartMang;
    private int numberOflightSys;
    private int numberOfcctv;
    private int numberOfVehicleCom;
    private int numberOfSolarPanel;
    private int numberOfDisplay;
    
    
    
    private int avenue;
    private int totalInvestment;
    private int year;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public int getNumberOfsmartMang() {
		return numberOfsmartMang;
	}

	public void setNumberOfsmartMang(int numberOfsmartMang) {
		this.numberOfsmartMang = numberOfsmartMang;
	}

	public int getNumberOflightSys() {
		return numberOflightSys;
	}

	public void setNumberOflightSys(int numberOflightSys) {
		this.numberOflightSys = numberOflightSys;
	}

	public int getNumberOfcctv() {
		return numberOfcctv;
	}

	public void setNumberOfcctv(int numberOfcctv) {
		this.numberOfcctv = numberOfcctv;
	}

	public int getNumberOfVehicleCom() {
		return numberOfVehicleCom;
	}

	public void setNumberOfVehicleCom(int numberOfVehicleCom) {
		this.numberOfVehicleCom = numberOfVehicleCom;
	}

	public int getNumberOfSolarPanel() {
		return numberOfSolarPanel;
	}

	public void setNumberOfSolarPanel(int numberOfSolarPanel) {
		this.numberOfSolarPanel = numberOfSolarPanel;
	}

	public int getNumberOfDisplay() {
		return numberOfDisplay;
	}

	public void setNumberOfDisplay(int numberOfDisplay) {
		this.numberOfDisplay = numberOfDisplay;
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
