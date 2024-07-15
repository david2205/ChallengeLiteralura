package com.robf3d.Desafio_literalura.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.robf3d.Desafio_literalura.models.Writer;

import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Writer,Long> {
    @Query(value = "SELECT * FROM autores",nativeQuery = true)
    List<Writer> obtenerTodosLosAutores();

    @Query(value = "SELECT * FROM autores a where :fecha > a.fecha_de_nacimiento and :fecha < a.fecha_de_muerte",nativeQuery = true)
    List<Writer> obtenerAutoresVivos(int fecha);
}
