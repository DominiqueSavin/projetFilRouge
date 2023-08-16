package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entity.Client;
import com.formaclean.projetfilrouge.entity.Job;
import com.formaclean.projetfilrouge.repository.ClientRepository;
import com.formaclean.projetfilrouge.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class JobService {

    private JobRepository jobRepository;
    private final ClientRepository clientRepository;
    //private final ClientService clientService;

    @Autowired
    public JobService(
            JobRepository jobRepository,
            ClientRepository clientRepository/*,ClientService clientService*/){
        this.jobRepository=jobRepository;
        this.clientRepository = clientRepository;
        //this.clientService=clientService;
    }


    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    public Job createJob(LocalDate date, String comment, String clientName){
        System.out.println();
        Client client = this.clientRepository.findByName(clientName).orElse(null);//orE
        if(client==null){
            client=new Client(clientName);
            client =clientRepository.save(client);
                    }
        Job job = new Job(date,comment,client);
        job = this.jobRepository.save(job);
        return job;
    }


}
