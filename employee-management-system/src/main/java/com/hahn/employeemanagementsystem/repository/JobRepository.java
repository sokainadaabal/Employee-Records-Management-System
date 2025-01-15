package com.hahn.employeemanagementsystem.repository;

import com.hahn.employeemanagementsystem.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRepository extends JpaRepository<Job, Long> {

}
