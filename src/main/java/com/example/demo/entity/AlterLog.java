package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AlterLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private ManyToOne warranty;
    private LocalDateTime sentAt;
    private String message;

}
