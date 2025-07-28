package br.com.alura.screenmatch.service;

public interface IConverteDados {
    //O T indica que estamos buscando algum dado, sem especificar qual dado vamos receber
    <T> T obterDados (String json, Class<T> classe);
}
