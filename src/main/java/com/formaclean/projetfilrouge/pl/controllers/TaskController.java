package com.formaclean.projetfilrouge.pl.controllers;

import com.formaclean.projetfilrouge.dal.entities.Task;
import com.formaclean.projetfilrouge.models.forms.TaskCreateForm;
import com.formaclean.projetfilrouge.bl.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        return taskService.createTask(form.name());
    }
}