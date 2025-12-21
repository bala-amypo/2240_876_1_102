package com.example.demo.controller;

import com.example.demo.entity.Warranty;
import com.example.demo.service.WarrantyService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/warranties")
@Tag(name = "Warranties")
public class WarrantyController {

    private final WarrantyService warrantyService;

    public WarrantyController(WarrantyService warrantyService) {
        this.warrantyService = warrantyService;
    }

    @PostMapping("/register/{userId}/{productId}")
    public ResponseEntity<Warranty> register(
            @PathVariable Long userId,
            @PathVariable Long productId,
            @RequestBody Warranty warranty) {

        return ResponseEntity.ok(
                warrantyService.registerWarranty(userId, productId, warranty));
    }



    @GetMapping("/{warrantyId}")
    @Operation(summary = "Get a warranty")
    public ResponseEntity<Warranty> getWarranty(@PathVariable Long warrantyId) {
        return ResponseEntity.ok(warrantyService.getWarranty(warrantyId));
    }

    @GetMapping("/user/{userId}")
    @Operation(summary = "List warranties for a user")
    public ResponseEntity<List<Warranty>> getUserWarranties(@PathVariable Long userId) {
        return ResponseEntity.ok(warrantyService.getUserWarranties(userId));
    }
}
