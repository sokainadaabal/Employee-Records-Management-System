package com.hahn.employeemanagementsystem.dto;



import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {
    private Long id;

    @NotEmpty
    private String fullName;

    private String employeeId;

    private String jobTitle;

    private String department;

    private LocalDate hireDate;

    private String employmentStatus;

    private ContactInfoDTO contactInfo;
}
