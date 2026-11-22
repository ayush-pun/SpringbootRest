package com.ayush.springbootrest.service;


import com.ayush.springbootrest.model.JobPost;
import com.ayush.springbootrest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJobs(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAllJobs(){
       return repo.getAllJobs();
    }

    public JobPost getJob(int i) {
        return repo.getJob(i);
    }
}
