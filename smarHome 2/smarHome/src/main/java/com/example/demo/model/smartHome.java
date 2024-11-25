 package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "device_costs")
public class smartHome {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 @Column(name = "device")
	    private String device;

	    private BigDecimal cost;
	    
	    
	    public smartHome() {}

	    // Constructor with parameters
	    public smartHome(String device ,BigDecimal cost) {
	        this.device = device;
	        this.cost= cost;
	    }
	    
	    
	    private int rooms;
	    private int robotVacuums;
	    private int lawnMowers;
	    private int smartBulbs;
	    private int switches;
	    private int thermostats;
	    private int ventSystems;
	    private int assistants;
	    private int detectors;
	    private int doorbells;
	    private int cameras;
	    private int locks;
	    
	    private BigDecimal totalAvenue;
	    private BigDecimal totalInvestment;	    
	    private BigDecimal year;

	    

		

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

		public BigDecimal getYear() {
			return year;
		}

		public void setYear(BigDecimal year) {
			this.year = year;
		}

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

		public int getRooms() {
			return rooms;
		}

		public void setRooms(int rooms) {
			this.rooms = rooms;
		}

		public int getRobotVacuums() {
			return robotVacuums;
		}

		public void setRobotVacuums(int robotVacuums) {
			this.robotVacuums = robotVacuums;
		}

		public int getLawnMowers() {
			return lawnMowers;
		}

		public void setLawnMowers(int lawnMowers) {
			this.lawnMowers = lawnMowers;
		}

		public int getSmartBulbs() {
			return smartBulbs;
		}

		public void setSmartBulbs(int smartBulbs) {
			this.smartBulbs = smartBulbs;
		}

		public int getSwitches() {
			return switches;
		}

		public void setSwitches(int switches) {
			this.switches = switches;
		}

		public int getThermostats() {
			return thermostats;
		}

		public void setThermostats(int thermostats) {
			this.thermostats = thermostats;
		}

		public int getVentSystems() {
			return ventSystems;
		}

		public void setVentSystems(int ventSystems) {
			this.ventSystems = ventSystems;
		}

		public int getAssistants() {
			return assistants;
		}

		public void setAssistants(int assistants) {
			this.assistants = assistants;
		}

		public int getDetectors() {
			return detectors;
		}

		public void setDetectors(int detectors) {
			this.detectors = detectors;
		}

		public int getDoorbells() {
			return doorbells;
		}

		public void setDoorbells(int doorbells) {
			this.doorbells = doorbells;
		}

		public int getCameras() {
			return cameras;
		}

		public void setCameras(int cameras) {
			this.cameras = cameras;
		}

		public int getLocks() {
			return locks;
		}

		public void setLocks(int locks) {
			this.locks = locks;
		}
	    
	    
	    

}
