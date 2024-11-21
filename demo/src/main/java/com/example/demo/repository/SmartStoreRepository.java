package com.example.demo.repository;

import com.example.demo.model.SmartStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SmartStoreRepository extends JpaRepository<SmartStore, Long> {
    List<SmartStore> findByCategory(String category); // Query by category
}
