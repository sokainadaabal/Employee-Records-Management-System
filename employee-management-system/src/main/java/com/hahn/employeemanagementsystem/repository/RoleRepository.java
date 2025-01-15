package com.hahn.employeemanagementsystem.repository;

import com.hahn.employeemanagementsystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
