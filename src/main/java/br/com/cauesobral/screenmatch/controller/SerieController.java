package br.com.cauesobral.screenmatch.controller;

import br.com.cauesobral.screenmatch.model.Serie;
import br.com.cauesobral.screenmatch.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SerieController {

    @Autowired
    private SerieRepository repository;

    @GetMapping("/series")
    public List<Serie> obterSeries() {
        return repository.findAll();
    }
}
