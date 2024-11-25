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
@Table(name = "facilities")
public class SmartBuildingInfra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")  // Ensure column name matches the database column
    private String device;
    
    private BigDecimal cost;

    // Default constructor
    public SmartBuildingInfra() {}

    // Constructor with parameters
    public SmartBuildingInfra(String device,BigDecimal cost) {
    	this.device = device;
        this.cost = cost;
    }

    private int numberOfBuilding;
    private int numberOfmeter;
    private int numberOfGym;
    private int numberOfPool;
    private int numberOfGarden;
    private int numberOfhall;
    private int numberOfClubHouse;
    
    
    
    private int avenue;
    private int totalInvestment;
    private int year;
    private int	salary;
    
    
    
	public int getNumberOfmeter() {
		return numberOfmeter;
	}

	public void setNumberOfmeter(int numberOfmeter) {
		this.numberOfmeter = numberOfmeter;
	}

	public int getNumberOfGym() {
		return numberOfGym;
	}

	public void setNumberOfGym(int numberOfGym) {
		this.numberOfGym = numberOfGym;
	}

	public int getNumberOfPool() {
		return numberOfPool;
	}

	public void setNumberOfPool(int numberOfPool) {
		this.numberOfPool = numberOfPool;
	}

	public int getNumberOfGarden() {
		return numberOfGarden;
	}

	public void setNumberOfGarden(int numberOfGarden) {
		this.numberOfGarden = numberOfGarden;
	}

	public int getNumberOfhall() {
		return numberOfhall;
	}

	public void setNumberOfhall(int numberOfhall) {
		this.numberOfhall = numberOfhall;
	}

	public int getNumberOfClubHouse() {
		return numberOfClubHouse;
	}

	public void setNumberOfClubHouse(int numberOfClubHouse) {
		this.numberOfClubHouse = numberOfClubHouse;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return device;
	}

	public void setName(String device) {
		this.device = device;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public int getNumberOfBuilding() {
		return numberOfBuilding;
	}

	public void setNumberOfBuilding(int numberOfBuilding) {
		this.numberOfBuilding = numberOfBuilding;
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
