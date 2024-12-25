package com.sc.JobApp.repo;

import com.sc.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    // Initialize the list of job posts
    List<JobPost> jobPosts = new ArrayList<>();

    // Constructor to add a default job post
    public JobRepo() {
        addJob(new JobPost(
                20,
                "IT Project Manager",
                "Lead and manage IT projects from initiation to completion",
                6,
                List.of("Project Management", "Agile", "Scrum", "Risk Management")
        ));addJob(new JobPost(
                21,
                "IT Project Manager",
                "Lead and manage IT projects from initiation to completion",
                6,
                List.of("Project Management", "Agile", "Scrum", "Risk Management")
        ));addJob(new JobPost(
                22,
                "IT Project Manager",
                "Lead and manage IT projects from initiation to completion",
                6,
                List.of("Project Management", "Agile", "Scrum", "Risk Management")
        ));addJob(new JobPost(
                23,
                "IT Project Manager",
                "Lead and manage IT projects from initiation to completion",
                6,
                List.of("Project Management", "Agile", "Scrum", "Risk Management")
        ));addJob(new JobPost(
                24,
                "IT Project Manager",
                "Lead and manage IT projects from initiation to completion",
                6,
                List.of("Project Management", "Agile", "Scrum", "Risk Management")
        ));addJob(new JobPost(
                25,
                "IT Project Manager",
                "Lead and manage IT projects from initiation to completion",
                6,
                List.of("Project Management", "Agile", "Scrum", "Risk Management")
        ));addJob(new JobPost(
                26,
                "IT Project Manager",
                "Lead and manage IT projects from initiation to completion",
                6,
                List.of("Project Management", "Agile", "Scrum", "Risk Management")
        ));

    }

    // Method to add a new job post
    public void addJob(JobPost job) {
        jobPosts.add(job);
    }

    // Method to retrieve all job posts
    public List<JobPost> getAllJobsPost() {
        return jobPosts;
    }
}
