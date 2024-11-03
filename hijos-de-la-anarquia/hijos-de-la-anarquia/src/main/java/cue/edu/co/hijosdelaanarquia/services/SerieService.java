package cue.edu.co.hijosdelaanarquia.services;

import cue.edu.co.hijosdelaanarquia.dtos.CreateEpisodeRequestDTO;
import cue.edu.co.hijosdelaanarquia.dtos.CreateSeasonRequestDTO;
import cue.edu.co.hijosdelaanarquia.models.Serie;
import cue.edu.co.hijosdelaanarquia.models.SerieSeason;

import java.util.Optional;

public interface SerieService {
  Serie save(Serie serie);
  Optional<Serie> findById(Long id);
  SerieSeason getSeason(Long serieId, Long seasonId);
  boolean addSeason(Long serieId, CreateSeasonRequestDTO createSeasonRequestDTO);
  boolean addEpisode(Long serieId, Long seasonId, CreateEpisodeRequestDTO createEpisodeRequestDTO);
}
