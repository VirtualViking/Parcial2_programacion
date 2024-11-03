package cue.edu.co.hijosdelaanarquia.repositories.impl;

import cue.edu.co.hijosdelaanarquia.models.Serie;
import cue.edu.co.hijosdelaanarquia.repositories.SerieRepository;
import cue.edu.co.hijosdelaanarquia.repositories.jpa.SerieJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class SerieRepositoryImpl implements SerieRepository {
  private final SerieJpaRepository serieJpaRepository;
  @Override
  public Serie save(Serie serie) {
    return serieJpaRepository.save(serie);
  }

  @Override
  public Optional<Serie> findById(Long id) {
    return serieJpaRepository.findById(id);
  }


}
