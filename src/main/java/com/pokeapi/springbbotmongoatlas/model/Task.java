package com.pokeapi.springbbotmongoatlas.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "pokemones")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    @Id
    private String id;
    private String Nombre;
    private String Altura;
    private String Peso;
    private String ExperienciaBase;
    private String Descripcion;
    private String Tipo1;
    private String Tipo2;
    private String Foto;
    private String Movimiento1;
    private String Movimiento2;
    private String Movimiento3;
    private String Movimiento4;
}
