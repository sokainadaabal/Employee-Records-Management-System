package com.hahn.employeemanagementsystem.service;

import com.hahn.employeemanagementsystem.entity.Employee;
import com.hahn.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {


    List<Employee> getAllEmployees();

    Employee createEmployee(Employee employee);

   void deleteEmployee(Long id);
}

