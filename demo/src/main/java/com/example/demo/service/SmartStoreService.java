package com.example.demo.service;

import com.example.demo.model.SmartStore;
import com.example.demo.repository.SmartStoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SmartStoreService {

    private final SmartStoreRepository smartStoreRepository;

    public SmartStoreService(SmartStoreRepository smartStoreRepository) {
        this.smartStoreRepository = smartStoreRepository;
    }

    public List<SmartStore> getDevicesByCategory(String category) {
        return smartStoreRepository.findByCategory(category);
    }

    public double calculateRevenue(String category, List<Integer> quantities) {
        List<SmartStore> devices = getDevicesByCategory(category);
        double totalRevenue = 0.0;

        for (int i = 0; i < quantities.size(); i++) {
            totalRevenue += devices.get(i).getPrice() * quantities.get(i);
        }

        return totalRevenue;
    }
}
