package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entities.Worker;
import com.formaclean.projetfilrouge.repository.WorkerRepository;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository){
        this.workerRepository=workerRepository;
    }


    public Worker createWorker(String firstName, String lastName){

        Worker worker = new Worker(firstName,lastName);
        return worker;
    }



}
