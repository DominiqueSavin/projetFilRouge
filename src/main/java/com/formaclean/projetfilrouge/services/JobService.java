package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entity.*;
import com.formaclean.projetfilrouge.repository.ClientRepository;
import com.formaclean.projetfilrouge.repository.JobRepository;
import com.formaclean.projetfilrouge.repository.TrolleyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobService {

    private JobRepository jobRepository;
    private final ClientRepository clientRepository;

    private final TrolleyRepository trolleyRepository;
    //private final ClientService clientService;

    @Autowired
    public JobService(
            JobRepository jobRepository,
            ClientRepository clientRepository, TrolleyRepository trolleyRepository){
        this.jobRepository=jobRepository;
        this.clientRepository = clientRepository;
        this.trolleyRepository=trolleyRepository;
    }


    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    public Job createJob(LocalDate date, String comment, String clientName){
        Client client = this.clientRepository.findByName(clientName).orElse(null);
        if(client==null){
            client=new Client(clientName);
            client =clientRepository.save(client);
                    }
        Job job = new Job(date,comment,client);
        job = this.jobRepository.save(job);
        return job;
    }

    public void allocateWorker(Job job, Worker worker){
        job.setWorker(worker);
    }

    public void allocateTrolley(long jobId, int trolleyId){
        Job job = jobRepository.findById(jobId).orElseThrow();
        Trolley trolley = trolleyRepository.findById(trolleyId).orElseThrow();
        job.setTrolley(trolley);
        jobRepository.save(job);

    }

    public void addTask(Job job, Task task){
        job.getTaskList().add(task);
    }


}
