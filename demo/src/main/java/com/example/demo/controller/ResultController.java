package com.example.demo.controller;

import com.example.demo.model.ROIRequest;
import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/results")
public class ResultController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/calculate-roi")
    public Map<String, Object> calculateROI(@RequestBody ROIRequest roiRequest) {
        return itemService.calculateROI(roiRequest);
    }
}
