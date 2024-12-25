package com.sc.JobApp.service;

import com.sc.JobApp.model.JobPost;
import com.sc.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;
    public void addJobPost(JobPost job){
        repo.addJob(job);
    }
    public List<JobPost> getAllJobPosts(){
        return repo.getAllJobsPost();
    }
}
