package com.example.demo.service;

import com.example.demo.dto.ROICalculationPredictive;
import com.example.demo.model.PredictiveMaintenance;
import com.example.demo.repository.PredictiveMainRepo;
import org.springframework.stereotype.Service;

@Service
public class PredictiveMaintenanceService {

    private final PredictiveMainRepo repository;

    public PredictiveMaintenanceService(PredictiveMainRepo repository) {
        this.repository = repository;
    }

    // Calculate ROI and return the result
    public PredictiveMaintenance calculateROI(ROICalculationPredictive dto) {
        PredictiveMaintenance maintenance = new PredictiveMaintenance();

        // Set values from DTO to Model
        maintenance.setTotalInvestmentCost(dto.getTotalInvestmentCost());
        maintenance.setAnnualOperatingCost(dto.getAnnualOperatingCost());
        maintenance.setTotalAnnualBenefits(dto.getTotalAnnualBenefits());
        maintenance.setDowntimeHours(dto.getDowntimeHours());
        maintenance.setMaintenanceCostSavings(dto.getMaintenanceCostSavings());

        // Calculate ROI
        double roi = ((dto.getTotalAnnualBenefits() - dto.getAnnualOperatingCost()) / dto.getTotalInvestmentCost()) * 100;
        maintenance.setRoi(roi);

        // Save and return the model
        return repository.save(maintenance);
    }
}
