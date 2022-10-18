package com.scaler.springproject.controllers;

import com.scaler.springproject.model.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

@RestController
@RequestMapping("/tasks")
public class TasksController {

    /*Building A Task Manager API that does the following
    * 1. Create a Task(with following attributes)
    *   -Title
    *   -Due Date
    *   -Status(Pending, In Progress, Completed)
    *
    * 2. Update a task
    * 3. Delete a task
    * 4. List all task*/

    ArrayList<Task> tasksList;

    public TasksController() {
        this.tasksList = new ArrayList<>();
        this.tasksList.add(new Task(1L, "Complete Spring Boot", new Date(), false, true, true));
        this.tasksList.add(new Task(2L, "Complete React", new Date(), false, true, false));
    }

    @GetMapping("")
    public ArrayList<Task> getTasksList(){
        return tasksList;
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable("id") Integer id){
        return tasksList.get(id);
    }
}
