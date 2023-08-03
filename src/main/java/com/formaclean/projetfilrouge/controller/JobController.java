package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entities.Job;
import com.formaclean.projetfilrouge.entities.Worker;
import com.formaclean.projetfilrouge.models.forms.WorkerCreateForm;
import com.formaclean.projetfilrouge.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class JobController {

    private JobService jobService;

    @Autowired
    public JobController(JobService jobService){
        this.jobService=jobService;
    }

    //region Mappings
    @GetMapping("/jobs")
    public List<Job> getJobs(){
        return jobService.getAllJobs();
    }
    @PostMapping("/jobs")
    public Job createJob(@Validated @RequestBody WorkerCreateForm form){
        return workerService.createWorker(form.firstName(), form.lastName());
    }





}
