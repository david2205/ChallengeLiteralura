package com.robf3d.Desafio_literalura.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WriterDates(@JsonAlias("name")
                         String nombre,
                         @JsonAlias("birth_year")
                         int fechaDeNacimiento,
                         @JsonAlias("death_year")
                         int fechaDeMuerte){


}
