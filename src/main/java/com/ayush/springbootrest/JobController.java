package com.ayush.springbootrest;

import com.ayush.springbootrest.model.JobPost;
import com.ayush.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts}")
    public List<JobPost> getAllPosts(){
        return service.getAllJobs();
    }


}
