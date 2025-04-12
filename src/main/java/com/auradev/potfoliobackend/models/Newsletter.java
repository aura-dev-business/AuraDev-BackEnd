package com.auradev.potfoliobackend.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "newsletter_subscriptions")
@Data
public class Newsletter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;
}