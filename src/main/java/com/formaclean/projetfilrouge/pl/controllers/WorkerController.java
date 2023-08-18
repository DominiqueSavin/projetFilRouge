package com.formaclean.projetfilrouge.pl.controllers;
//region imports
import com.formaclean.projetfilrouge.dal.entities.Worker;
import com.formaclean.projetfilrouge.models.forms.WorkerCreateForm;
import com.formaclean.projetfilrouge.bl.services.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//endregion imports

import java.util.List;

@RestController
public class WorkerController {

    private final WorkerService workerService;

   @Autowired
   WorkerController(WorkerService workerService){
        this.workerService=workerService;
    }
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //region Mappings
    @GetMapping("/workers")
    public List<Worker> getWorkers(){
       return workerService.getAllWorkers();
    }
    @PostMapping("/workers")
    public Worker createWorker(@Validated @RequestBody WorkerCreateForm form){
       return workerService.createWorker(form.firstName(), form.lastName());
    }
    //endregion
    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

}
