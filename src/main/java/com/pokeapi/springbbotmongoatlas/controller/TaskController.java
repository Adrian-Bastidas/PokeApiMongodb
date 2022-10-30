package com.pokeapi.springbbotmongoatlas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pokeapi.springbbotmongoatlas.model.Task;
import com.pokeapi.springbbotmongoatlas.service.TaskService;

@RestController
@RequestMapping("/pokemones")
@CrossOrigin("*")
public class TaskController {
    @Autowired
    private TaskService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task) {
        return service.addTask(task);
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.findAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable String id) {
        return service.getTaskByTaskId(id);
    }

    @GetMapping("/{Nombre}")
    public List<Task> getTaskByNombre(@PathVariable String Nombre) {
        return service.getTaskByNombre(Nombre);
    }
}
