package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entities.Worker;
import com.formaclean.projetfilrouge.models.forms.WorkerCreateForm;
import com.formaclean.projetfilrouge.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Scanner;

@RestController
public class WorkerController {

    private final WorkerService workerService;

   @Autowired
   WorkerController(WorkerService workerService){
        this.workerService=workerService;
    }


    @GetMapping("/workers")
    public List<Worker> getWorkers(){

       return workerService.getAllWorkers();

    }





    @PostMapping("/workers")
    public Worker createWorker(@Validated @RequestBody WorkerCreateForm form){
       return workerService.createWorker(form.firstName(), form.lastName());
    }
}
