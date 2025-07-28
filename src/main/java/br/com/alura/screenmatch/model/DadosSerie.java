package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*a anotação @JsonAlias permite dar um "apelido" para especificar qual dado eu quero pegar da API, diferentemente
do @JsonProperty que serve também para fazer o mesmo, mas também serve tanto para a serealização quanto deserealização
Já o Alias serve para ler o json, nesse caso, ele devolveria o titulo da serie pois lé o que está originalmente no atributo,
ja o property vai devolver o texto
imdVotes*/
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias({"Title", "Titulo"}) String titulo, @JsonAlias("totalSeasons") Integer totalTemporadas,
                         @JsonAlias("imdbRating") String avaliacao /*@JsonProperty("imdbVotes") String votos*/) {
}
