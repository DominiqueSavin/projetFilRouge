package com.formaclean.projetfilrouge.bl.services;

import com.formaclean.projetfilrouge.dal.entities.Worker;
import com.formaclean.projetfilrouge.dal.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
