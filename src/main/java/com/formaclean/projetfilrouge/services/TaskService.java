package com.formaclean.projetfilrouge.services;

import com.formaclean.projetfilrouge.entity.Task;
import com.formaclean.projetfilrouge.entity.TaskType;
import com.formaclean.projetfilrouge.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

private TaskRepository taskRepository;

@Autowired
    public TaskService(TaskRepository taskRepository){
        this.taskRepository=taskRepository;
    }


    public List<Task> getAllTasks(){
     return taskRepository.findAll();
    }

    public Task createTask(){
        Task task = new Task();
        taskRepository.save(task);
        return task;
    }

    public void setTaskType(Task task, TaskType taskType){
    task.setType(taskType);
    }




}
