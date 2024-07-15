package com.robf3d.Desafio_literalura.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResultDates(
        @JsonAlias("results") List<BookDates> ResultadosJson
        ) {
}
