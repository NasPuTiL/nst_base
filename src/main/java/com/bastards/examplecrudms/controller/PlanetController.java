package com.bastards.examplecrudms.controller;

import com.bastards.examplecrudms.model.Planet;
import com.bastards.examplecrudms.repository.PlanetRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/planets")
public class PlanetController {

    private final PlanetRepository planetRepository;

    public PlanetController(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @GetMapping
    public List<Planet> findAll() {
        return planetRepository.findAll();
    }
}
