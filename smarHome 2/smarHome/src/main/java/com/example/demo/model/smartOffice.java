package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "office")
public class smartOffice {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column(name = "name") 
    private String name;

    private BigDecimal cost;
    
    
    public smartOffice() {}

    // Constructor with parameters
    public smartOffice(String name ,BigDecimal cost) {
        this.name = name;
        this.cost= cost;
    }
    
    
    private int units;
    private int hvacDefault;
    private int assistantsDefault;
    private int desksDefault;
    private int appliancesDefault;
    private int waterDefault;
    private BigDecimal totalAvenue;
    private BigDecimal totalInvestment;	    
    private BigDecimal year;


	public BigDecimal getTotalAvenue() {
		return totalAvenue;
	}

	public void setTotalAvenue(BigDecimal totalAvenue) {
		this.totalAvenue = totalAvenue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getHvacDefault() {
		return hvacDefault;
	}

	public void setHvacDefault(int hvacDefault) {
		this.hvacDefault = hvacDefault;
	}

	public int getAssistantsDefault() {
		return assistantsDefault;
	}

	public void setAssistantsDefault(int assistantsDefault) {
		this.assistantsDefault = assistantsDefault;
	}

	public int getDesksDefault() {
		return desksDefault;
	}

	public void setDesksDefault(int desksDefault) {
		this.desksDefault = desksDefault;
	}

	public int getAppliancesDefault() {
		return appliancesDefault;
	}

	public void setAppliancesDefault(int appliancesDefault) {
		this.appliancesDefault = appliancesDefault;
	}

	public int getWaterDefault() {
		return waterDefault;
	}

	public void setWaterDefault(int waterDefault) {
		this.waterDefault = waterDefault;
	}

	
	public BigDecimal getTotalInvestment() {
		return totalInvestment;
	}

	public void setTotalInvestment(BigDecimal totalInvestment) {
		this.totalInvestment = totalInvestment;
	}

	public BigDecimal getYear() {
		return year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	   
    
    

    

}
