package com.example.demo.service;

import com.example.demo.model.Item;
import com.example.demo.model.ROIRequest;
import com.example.demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    /**
     * Retrieves items by category.
     *
     * @param category The category name.
     * @return List of items in the given category.
     */
    public List<Item> getItemsByCategory(String category) {
        return itemRepository.findByCategory(category); // Ensure findByCategory exists in the repository
    }

    /**
     * Calculates the total cost of items based on their IDs and quantities.
     *
     * @param itemIds    The list of item IDs.
     * @param quantities The list of quantities for each item.
     * @return The total cost of all items.
     */
    public double calculateTotalCost(List<Integer> itemIds, List<Integer> quantities) {
        List<Item> items = itemRepository.findAllById(itemIds);
        double totalCost = 0;

        for (int i = 0; i < items.size(); i++) {
            totalCost += items.get(i).getPricePerUnit() * quantities.get(i);
        }

        return totalCost;
    }
    
    /**
     * Calculates the total revenue based on total cost and investment period.
     *
     * @param totalCost The total cost of the items.
     * @param years     The investment period in years.
     * @return The total revenue.
     */
    public double calculateTotalRevenue(double totalCost, int years) {
        return totalCost * years; // Revenue = Total Cost × Years
    }
    /**
     * Calculates the total revenue of items based on their IDs, quantities, and investment period.
     *
     * @param itemIds    The list of item IDs.
     * @param quantities The list of quantities for each item.
     * @param years      The investment period in years.
     * @return The total revenue generated over the investment period.
     */
    public double calculateRevenue(List<Integer> itemIds, List<Integer> quantities, int years) {
        double totalCost = calculateTotalCost(itemIds, quantities);
        return totalCost * years; // Revenue = Total Cost × Years
    }


    /**
     * Calculates the ROI based on the ROIRequest object.
     *
     * @param roiRequest The ROIRequest containing item IDs, quantities, and years.
     * @return A map containing ROI details (totalCost, totalRevenue, netReturn, roiPercentage).
     */
    public Map<String, Object> calculateROI(ROIRequest roiRequest) {
        List<Integer> itemIds = roiRequest.getItemIds();
        List<Integer> quantities = roiRequest.getQuantities();
        int years = roiRequest.getYears();

        // Calculate total cost
        double totalCost = calculateTotalCost(itemIds, quantities);

        // Calculate total revenue directly from total cost and years
        double totalRevenue = calculateTotalRevenue(totalCost, years);

        // Calculate ROI
        double netReturn = totalRevenue - totalCost;
        double roiPercentage = (netReturn / totalCost) * 100;

        // Prepare response
        Map<String, Object> roiDetails = new HashMap<>();
        roiDetails.put("totalCost", totalCost);
        roiDetails.put("totalRevenue", totalRevenue);
        roiDetails.put("roiPercentage", roiPercentage);

        return roiDetails;
    }

}
