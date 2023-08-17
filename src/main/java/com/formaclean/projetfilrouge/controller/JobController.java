package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entity.Job;
import com.formaclean.projetfilrouge.entity.Trolley;
import com.formaclean.projetfilrouge.models.forms.AllocateTrolleyForm;
import com.formaclean.projetfilrouge.models.forms.JobCreateForm;
import com.formaclean.projetfilrouge.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
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
    public Job createJob(@Validated @RequestBody JobCreateForm form){
        return jobService.createJob(LocalDate.parse(form.date()), form.comment(),form.clientName());
    }

    @PatchMapping("/jobs/allocateTrolley")
    public void allocateTrolley(@RequestBody AllocateTrolleyForm form){
        jobService.allocateTrolley(form.jobId(),form.trolleyId());
    }






}
