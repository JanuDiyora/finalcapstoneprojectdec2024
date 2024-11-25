package com.example.demo.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SmartBuildingInfra;
import com.example.demo.model.smartHome;

public interface BuildingInfraRepository extends JpaRepository<SmartBuildingInfra, Long> {
	SmartBuildingInfra findByDevice(String name);
}