package com.example.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SmartParking {
	
	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigDecimal sensors;
    private BigDecimal gateways;
    private BigDecimal panels;
    private BigDecimal costSpot;
    private BigDecimal sensorInstallation;
    private BigDecimal gatewayInstallation;
    private BigDecimal panelInstallation;
    private BigDecimal totalInvestment;
    private BigDecimal avenue;
    private int year;
	public BigDecimal getSensors() {
		return sensors;
	}
	public void setSensors(BigDecimal sensors) {
		this.sensors = sensors;
	}
	public BigDecimal getGateways() {
		return gateways;
	}
	public void setGateways(BigDecimal gateways) {
		this.gateways = gateways;
	}
	public BigDecimal getPanels() {
		return panels;
	}
	public void setPanels(BigDecimal panels) {
		this.panels = panels;
	}
	public BigDecimal getCostSpot() {
		return costSpot;
	}
	public void setCostSpot(BigDecimal costSpot) {
		this.costSpot = costSpot;
	}
	public BigDecimal getSensorInstallation() {
		return sensorInstallation;
	}
	public void setSensorInstallation(BigDecimal sensorInstallation) {
		this.sensorInstallation = sensorInstallation;
	}
	public BigDecimal getGatewayInstallation() {
		return gatewayInstallation;
	}
	public void setGatewayInstallation(BigDecimal gatewayInstallation) {
		this.gatewayInstallation = gatewayInstallation;
	}
	public BigDecimal getPanelInstallation() {
		return panelInstallation;
	}
	public void setPanelInstallation(BigDecimal panelInstallation) {
		this.panelInstallation = panelInstallation;
	}
	public BigDecimal getTotalInvestment() {
		return totalInvestment;
	}
	public void setTotalInvestment(BigDecimal totalInvestment) {
		this.totalInvestment = totalInvestment;
	}
	public BigDecimal getAvenue() {
		return avenue;
	}
	public void setAvenue(BigDecimal avenue) {
		this.avenue = avenue;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
    
    
}
