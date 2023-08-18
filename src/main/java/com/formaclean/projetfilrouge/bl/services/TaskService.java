package com.formaclean.projetfilrouge.bl.services;

import com.formaclean.projetfilrouge.dal.entities.Task;
import com.formaclean.projetfilrouge.dal.enums.TaskType;
import com.formaclean.projetfilrouge.dal.repositories.TaskRepository;
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

    public Task createTask(String name){
        Task task = new Task();
        task.setName(name);
        taskRepository.save(task);
        return task;
    }

    public void setTaskType(Task task, TaskType taskType){
    task.setType(taskType);
    }




}
