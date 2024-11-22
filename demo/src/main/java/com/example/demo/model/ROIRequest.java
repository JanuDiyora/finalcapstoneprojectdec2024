package com.example.demo.model;

import java.util.List;

public class ROIRequest {
    private List<Integer> itemIds;
    private List<Integer> quantities;
    private int years;

    // Getters and Setters
    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
