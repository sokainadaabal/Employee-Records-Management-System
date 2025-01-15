package com.hahn.employeemanagementsystem.entity;

import com.hahn.employeemanagementsystem.enums.StatusEmployee;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String fullName;

    @Column(unique = true, nullable = false)
    private String employeeId;

    @NotBlank
    private String jobTitle;

    @NotBlank
    private String department;

    @NotNull
    private LocalDate hireDate;

    @NotBlank
    @Enumerated(value = EnumType.ORDINAL)
    private StatusEmployee employmentStatus;

    @Embedded
    private ContactInfo contactInfo;
}


