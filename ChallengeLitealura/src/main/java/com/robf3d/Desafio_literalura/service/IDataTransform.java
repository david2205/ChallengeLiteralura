package com.robf3d.Desafio_literalura.service;

public interface IDataTransform {
    <T> T obtenerDatos(String json, Class<T> clase);
}
