package com.robf3d.Desafio_literalura.models;


import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "Libros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String titulo;
    //@OneToOne(mappedBy = "libro", cascade = CascadeType.ALL, fetch = FetchType.LAZY,optional = false)
    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Writer writer;
    private List<String> idiomas;
    private int descargasTotales;

    public Book(){}

    public Book(String titulo, List<String> idiomas, int descargasTotales, Writer writer1 ) {
        this.titulo = titulo;
        this.idiomas = idiomas;
        this.descargasTotales = descargasTotales;
        this.writer=writer1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Writer getAutor() {
        return writer;
    }

    public void setAutor(Writer writer) {
        this.writer = writer;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public int getDescargasTotales() {
        return descargasTotales;
    }

    public void setDescargasTotales(int descargasTotales) {
        this.descargasTotales = descargasTotales;
    }


    @Override
    public String toString() {
        return "\n" + "**********LIBRO**********" + "\n" +
                "Titulo = " + titulo + "\n" +
                "Autor = " + writer.getNombre() + "\n" +
                "Idiomas = " + idiomas.get(0) + "\n" +
                "DescargasTotales = " + descargasTotales + "\n" +
                "*************************" + "\n";
    }
}
