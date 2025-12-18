package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

public class warranty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ManyToOne user;
    private LocalDate purchaseDate;
    private LocalDate expriyDate;
    @Column(unique = true)
    private String serialNumber;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ManyToOne getUser() {
        return user;
    }
    public void setUser(ManyToOne user) {
        this.user = user;
    }
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }
    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    public LocalDate getExpriyDate() {
        return expriyDate;
    }
    public void setExpriyDate(LocalDate expriyDate) {
        this.expriyDate = expriyDate;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public warranty(ManyToOne user, LocalDate purchaseDate, LocalDate expriyDate, String serialNumber) {
        this.user = user;
        this.purchaseDate = purchaseDate;
        this.expriyDate = expriyDate;
        this.serialNumber = serialNumber;
    }

}
