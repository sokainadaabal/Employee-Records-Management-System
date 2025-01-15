package com.hahn.employeemanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "app_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String passwordHash;

    @Column(unique = true, nullable = false)
    @Email
    private String email;

    @ManyToMany
    @JoinTable(
            name = "users_roles", // Nom de la table de jointure
            joinColumns = @JoinColumn(name = "user_id"), // Colonne pour l'ID de l'utilisateur
            inverseJoinColumns = @JoinColumn(name = "role_id") // Colonne pour l'ID du rôle
    )
    private List<Role> roles;

    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }
}