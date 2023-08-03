package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entities.Worker;
import com.formaclean.projetfilrouge.repository.WorkerRepository;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    @Autowired
    WorkerService(WorkerRepository workerRepository){
        this.workerRepository=workerRepository;
    }


    public Worker createWorker(String firstName, String lastName){

        Worker worker = new Worker(firstName,lastName);
        this.workerRepository.save(worker);
        return worker;
    }

    public List<Worker> getAllWorkers(){
        return workerRepository.findAll();
    }



}
