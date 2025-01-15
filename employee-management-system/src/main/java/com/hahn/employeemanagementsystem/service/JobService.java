package com.hahn.employeemanagementsystem.service;


import com.hahn.employeemanagementsystem.entity.Job;

import java.util.List;

public interface JobService {

    Job getJob(Long id);
    Job addJob(Job job);
    Job updateJob(Job job);
    void deleteJob(int id);
    List<Job> getAllJobs();
}
