package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.FleetInfo;

public interface FleetRepository extends JpaRepository<FleetInfo, Long> {
    // Custom query to find a feature by category and description if needed
    List<FleetInfo> findByCategory(String category);
    FleetInfo findByCategoryAndDescription(String category, String description);
}