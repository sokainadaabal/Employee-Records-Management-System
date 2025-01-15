package com.hahn.employeemanagementsystem.service;

import com.hahn.employeemanagementsystem.entity.Job;
import com.hahn.employeemanagementsystem.repository.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Job getJob(Long id) {
        return jobRepository.findById(id)
                .orElse(null);
    }

    @Override
    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public Job updateJob(Job job) {
        Job oldJob = getJob(job.getId());

        return null;
    }

    @Override
    public void deleteJob(int id) {

    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}
