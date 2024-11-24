package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PublicTransit;

public interface FeatureRepositoryTransit extends JpaRepository<PublicTransit, Long> {
    // Custom query to find a feature by category and description if needed
    List<PublicTransit> findByCategory(String category);
    PublicTransit findByCategoryAndDescription(String category, String description);
}