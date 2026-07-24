package br.com.cauesobral.screenmatch.dto;

import br.com.cauesobral.screenmatch.model.Categoria;
import jakarta.persistence.*;

public record SerieDTO(Long id, String titulo, Integer totalTemporadas, Double avaliacao,
                       Categoria genero, String atores, String poster, String sinopse) {
}
