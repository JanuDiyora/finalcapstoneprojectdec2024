package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.smartHome;
import com.example.demo.model.smartOffice;

@Repository
public interface SmartOfficeRepository extends JpaRepository<smartOffice, Long> {
    // Custom query to find a feature by category and description if needed

	smartOffice findByName(String name);
  
}