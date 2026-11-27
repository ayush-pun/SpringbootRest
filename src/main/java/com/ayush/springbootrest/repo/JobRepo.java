package com.ayush.springbootrest.repo;


import com.ayush.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

}









/**public void addJob(JobPost jobPost){
    jobs.add(jobPost);
    System.out.println(jobs);
}

public List<JobPost> getAllJobs(){
    return jobs;
}

public JobPost getJob(int i) {

    for(JobPost job : jobs){
        if(job.getPostId()==i){
            return job;
        }
    }
    return null;
}


public void deleteJob(int postId) {
    for(JobPost jobPost : jobs) {
        if (jobPost.getPostId() == postId) {
            jobs.remove(jobPost);
        }
    }
}

public void updateJob(JobPost jobPost) {
    for(JobPost job : jobs){
        if(job.getPostId()==jobPost.getPostId()){
            job.setPostProfile(jobPost.getPostProfile());
            job.setPostDesc(jobPost.getPostDesc());
            job.setPostId(jobPost.getPostId());
            job.setPostTechStack(jobPost.getPostTechStack());
            job.setReqExperience(jobPost.getReqExperience());
        }
    }
}**/