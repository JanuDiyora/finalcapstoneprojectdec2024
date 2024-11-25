package com.example.demo.service;

import com.example.demo.model.QualityControl;
import com.example.demo.repository.QualityControlRepo;
import com.example.demo.dto.ROICalculationQualityControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QualityControlService {

    @Autowired
    private QualityControlRepo qualityControlRepo;

    // Save a quality control record
    public void saveQualityControl(QualityControl qualityControl) {
        qualityControlRepo.save(qualityControl);
    }

    // Retrieve all records
    public List<QualityControl> getAllRecords() {
        return qualityControlRepo.findAll();
    }

    // Calculate ROI for a specific record
    public double calculateROI(int id) {
        QualityControl qc = qualityControlRepo.findById(id).orElseThrow(() ->
                new IllegalArgumentException("Quality control record not found for ID: " + id));
        return ROICalculationQualityControl.calculateROI(qc);
    }
}
