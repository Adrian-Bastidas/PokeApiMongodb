package com.pokeapi.springbbotmongoatlas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pokeapi.springbbotmongoatlas.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {

    List<Task> findByNombre(String Nombre);

}
