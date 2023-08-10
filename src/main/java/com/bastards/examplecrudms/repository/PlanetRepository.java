package com.bastards.examplecrudms.repository;

import com.bastards.examplecrudms.model.Planet;
import org.springframework.data.repository.ListCrudRepository;

public interface PlanetRepository extends ListCrudRepository<Planet, Long>  {
}
