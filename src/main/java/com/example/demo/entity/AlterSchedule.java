package com.example.demo.entity;

import jakarta.persistence.*;

public class AlterSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ManyToOne warranty;
    private int daysBeforeExpiry;
    private Boolean enabled;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ManyToOne getWarranty() {
        return warranty;
    }
    public void setWarranty(ManyToMany warranty) {
        this.warranty = (ManyToOne) warranty;
    }
    public int getDaysBeforeExpiry() {
        return daysBeforeExpiry;
    }
    public void setDaysBeforeExpiry(int daysBeforeExpiry) {
        this.daysBeforeExpiry = daysBeforeExpiry;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    public AlterSchedule(ManyToOne warranty, int daysBeforeExpiry, Boolean enabled) {
        this.warranty = warranty;
        this.daysBeforeExpiry = daysBeforeExpiry;
        this.enabled = enabled;
    }
}
