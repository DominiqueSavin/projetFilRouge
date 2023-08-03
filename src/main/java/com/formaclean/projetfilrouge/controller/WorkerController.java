package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entities.Worker;
import com.formaclean.projetfilrouge.requests.WorkerRequest;
import com.formaclean.projetfilrouge.services.WorkerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class WorkerController {

    private final WorkerService workerService;

    public WorkerController(WorkerService workerService){
        this.workerService=workerService;
    }


    @GetMapping("/getUsers")
    public List<Worker> getWorkers(){

    }


    @PostMapping ("/users")
    public Worker createWorker(@RequestBody ){

    }
}
