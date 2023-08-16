package com.formaclean.projetfilrouge.controller;

import com.formaclean.projetfilrouge.entity.Area;
import com.formaclean.projetfilrouge.entity.Job;
import com.formaclean.projetfilrouge.entity.Task;
import com.formaclean.projetfilrouge.models.forms.AreaCreateForm;
import com.formaclean.projetfilrouge.models.forms.JobCreateForm;
import com.formaclean.projetfilrouge.models.forms.TaskCreateForm;
import com.formaclean.projetfilrouge.services.AreaService;
import com.formaclean.projetfilrouge.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class TaskController {

    private TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }


    //region Mappings
    @GetMapping("/tasks")
    public List<Task> getTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping("/tasks")
    public Task createTask(@Validated @RequestBody TaskCreateForm form) {
        return taskService.createTask();
    }
}