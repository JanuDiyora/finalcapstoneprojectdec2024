package com.example.demo.repository;

import com.example.demo.model.PredictiveMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictiveMainRepo extends JpaRepository<PredictiveMaintenance, Long> {
}
