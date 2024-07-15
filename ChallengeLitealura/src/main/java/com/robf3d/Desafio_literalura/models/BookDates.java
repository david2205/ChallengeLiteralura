package com.robf3d.Desafio_literalura.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public record BookDates(@JsonAlias("title")
                          String titulo,
                          @JsonAlias("authors")
                          List<WriterDates> autor,
                          @JsonAlias("languages")
                          List<String> idiomas,
                          @JsonAlias("download_count")
                          int descargasTotales) {
}



