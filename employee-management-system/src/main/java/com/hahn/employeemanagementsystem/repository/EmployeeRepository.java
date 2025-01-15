package com.hahn.employeemanagementsystem.repository;

import com.hahn.employeemanagementsystem.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmployeeId(String employeeId);
    List<Employee> findByDepartment(String department);
}

