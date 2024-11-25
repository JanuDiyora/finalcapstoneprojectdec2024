package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.smartHome;

public interface SmartHomeRepository extends JpaRepository<smartHome, Long> {
    // Custom query to find a feature by category and description if needed
    smartHome findByDevice(String device);
  
}