package com.example.demo.service;

import com.example.demo.entity.Warranty;
import com.example.demo.dto.WarrantyRequest;

import java.util.List;

public interface WarrantyService {


    Warranty registerWarranty(Long userId, Long productId, WarrantyRequest request);

    Warranty getWarranty(Long warrantyId);

    List<Warranty> getUserWarranties(Long userId);
}