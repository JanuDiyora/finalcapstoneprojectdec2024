package com.example.demo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SmartElectricInfra;

public interface ElectricVehicleInfraRepository extends JpaRepository<SmartElectricInfra, Long> {
	Optional<SmartElectricInfra> findByDeviceName(String deviceName);
}