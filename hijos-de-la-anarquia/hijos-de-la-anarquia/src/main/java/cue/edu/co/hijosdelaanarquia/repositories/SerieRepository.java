package cue.edu.co.hijosdelaanarquia.repositories;

import cue.edu.co.hijosdelaanarquia.models.Serie;

import java.util.Optional;

public interface SerieRepository {
  Serie save(Serie serie);
  Optional<Serie> findById(Long id);

}
