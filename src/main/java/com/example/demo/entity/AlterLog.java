package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;

public class AlterLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ManyToOne warranty;
    private LocalDateTime sentAt;
    private String message;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public ManyToOne getWarranty() {
        return warranty;
    }
    public void setWarranty(ManyToOne warranty) {
        this.warranty = warranty;
    }
    public LocalDateTime getSentAt() {
        return sentAt;
    }
    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public AlterLog(ManyToOne warranty, LocalDateTime sentAt, String message) {
        this.warranty = warranty;
        this.sentAt = sentAt;
        this.message = message;
    }

}
