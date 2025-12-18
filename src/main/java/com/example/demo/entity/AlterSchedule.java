package com.example.demo.entity;

import jakarta.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AlterSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ManyToOne warranty;
    private int daysBeforeExpiry;
    private Boolean enabled;
    
}
