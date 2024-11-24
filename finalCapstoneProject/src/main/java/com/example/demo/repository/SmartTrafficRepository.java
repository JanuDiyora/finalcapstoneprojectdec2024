package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.SmartTraffic;

public interface SmartTrafficRepository extends JpaRepository<SmartTraffic, Long> {
	 List<SmartTraffic> findByCategory(String category);
	 SmartTraffic findByCategoryAndDescription(String category, String description);
}