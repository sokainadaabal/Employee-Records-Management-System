package com.hahn.employeemanagementsystem.repository;

import com.hahn.employeemanagementsystem.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
