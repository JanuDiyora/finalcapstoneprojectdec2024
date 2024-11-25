package com.example.demo.repository;

import com.example.demo.model.SmartInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SmartInventoryRepo extends JpaRepository<SmartInventory, Long> {
}
