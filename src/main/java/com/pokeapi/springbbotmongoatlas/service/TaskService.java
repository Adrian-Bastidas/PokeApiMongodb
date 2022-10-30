package com.pokeapi.springbbotmongoatlas.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokeapi.springbbotmongoatlas.model.Task;
import com.pokeapi.springbbotmongoatlas.repository.TaskRepository;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;
    // CRUD CREATE, READ, UPDATE, DELETE

    public Task addTask(Task task) {
        task.setId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(task);
    }

    public List<Task> findAllTasks() {
        return repository.findAll();
    }

    public Task getTaskByTaskId(String id) {
        return repository.findById(id).get();
    }

    public List<Task> getTaskByNombre(String Nombre) {
        return repository.findByNombre(Nombre);
    }
}
