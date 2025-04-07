package com.example.finance_tracker.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "app_user") // Explicitly set table name to avoid reserved keyword conflict
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Column(unique = true)
    private String email;

    private String password;
    
    
}
