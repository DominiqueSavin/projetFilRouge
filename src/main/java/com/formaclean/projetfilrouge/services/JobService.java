package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entities.Client;
import com.formaclean.projetfilrouge.entities.Job;
import com.formaclean.projetfilrouge.entities.Worker;
import com.formaclean.projetfilrouge.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobService {

    private JobRepository jobRepository;

    @Autowired
    public JobService(JobRepository jobRepository){
        this.jobRepository=jobRepository;
    }


    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    public Job createJob(LocalDate date, String comment, Client client){

        Job job = new Job(date,comment,client);
        this.jobRepository.save(job);
        return job;
    }


}
