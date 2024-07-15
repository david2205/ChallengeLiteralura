package com.robf3d.Desafio_literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.robf3d.Desafio_literalura.models.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface LibroRepository extends JpaRepository<Book,Long> {
    Optional<Book> findByTituloContainsIgnoreCase(String nombreLibro);

    @Query(value = "SELECT * FROM libros",nativeQuery = true)
    List<Book> obtenerTodosLosLibros();

//    @Query(value = "SELECT l.idiomas, l.descargas_totales, l.autor_id, l.id, l.titulo FROM autores a join libros l on a.id = l.autor_id ",nativeQuery = true)
//    List<Libro> obtenerLibrosDelAutor(List<Autor> autores);

    @Query(value = "SELECT * FROM libros WHERE idiomas @> '{en}'",nativeQuery = true)
    List<Book> obtenerLibroPorIdiomaEn();

    @Query(value = "SELECT * FROM libros WHERE idiomas @> '{es}'",nativeQuery = true)
    List<Book> obtenerLibroPorIdiomaEs();

    @Query(value = "SELECT * FROM libros WHERE idiomas @> '{fr}'",nativeQuery = true)
    List<Book> obtenerLibroPorIdiomaFr();

    @Query(value = "SELECT * FROM libros WHERE idiomas @> '{pr}'",nativeQuery = true)
    List<Book> obtenerLibroPorIdiomaPr();
}
