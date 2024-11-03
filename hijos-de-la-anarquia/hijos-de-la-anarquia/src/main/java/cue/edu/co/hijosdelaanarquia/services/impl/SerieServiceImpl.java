package cue.edu.co.hijosdelaanarquia.services.impl;

import cue.edu.co.hijosdelaanarquia.dtos.CreateEpisodeRequestDTO;
import cue.edu.co.hijosdelaanarquia.dtos.CreateSeasonRequestDTO;
import cue.edu.co.hijosdelaanarquia.exceptions.NotFoundException;
import cue.edu.co.hijosdelaanarquia.models.Serie;
import cue.edu.co.hijosdelaanarquia.models.SerieEpisode;
import cue.edu.co.hijosdelaanarquia.models.SerieSeason;
import cue.edu.co.hijosdelaanarquia.repositories.SerieRepository;
import cue.edu.co.hijosdelaanarquia.services.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static cue.edu.co.hijosdelaanarquia.utils.constants.ExceptionConstant.SEASON_NOT_FOUND;
import static cue.edu.co.hijosdelaanarquia.utils.constants.ExceptionConstant.SERIE_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class SerieServiceImpl implements SerieService {

  private final SerieRepository serieRepository;
  @Override
  public Serie save(Serie serie) {
    return serieRepository.save(serie);
  }

  @Override
  public Optional<Serie> findById(Long id) {
    return serieRepository.findById(id);
  }

  @Override
  public SerieSeason getSeason(Long serieId, Long seasonId) {
    Serie serie = serieRepository.findById(serieId).orElseThrow();

    return serie.getSeasons().stream()
      .filter(season -> season.getId().equals(seasonId))
      .findFirst()
      .orElseThrow();
  }

  @Override
  public boolean addSeason(Long serieId, CreateSeasonRequestDTO createSeasonRequestDTO) {
    Serie serie = serieRepository.findById(serieId).orElseThrow(()-> new NotFoundException(SERIE_NOT_FOUND));

    SerieSeason season = buildSerieSeason(createSeasonRequestDTO);
    serie.getSeasons().add(season);

    serieRepository.save(serie);

    return true;
  }

  @Override
  public boolean addEpisode(Long serieId, Long seasonId, CreateEpisodeRequestDTO createEpisodeRequestDTO) {
    Serie serie = serieRepository.findById(serieId).orElseThrow(()-> new NotFoundException(SERIE_NOT_FOUND));

    SerieSeason season = serie.getSeasons().stream()
            .filter(season1 -> season1.getId().equals(seasonId))
            .findFirst()
            .orElseThrow(() -> new NotFoundException(SEASON_NOT_FOUND));

    season.getEpisodes().add(buildSerieEpisode(createEpisodeRequestDTO));

    serieRepository.save(serie);

    return true;
  }

  private SerieSeason buildSerieSeason(CreateSeasonRequestDTO createSeasonRequestDTO) {
    return SerieSeason.builder()
            .urlImage(createSeasonRequestDTO.urlImage())
            .number(createSeasonRequestDTO.number())
            .releaseDate(createSeasonRequestDTO.releaseDate())
            .build();
  }

  private SerieEpisode buildSerieEpisode(CreateEpisodeRequestDTO createEpisodeRequestDTO) {
    return SerieEpisode.builder()
            .episodeNumber(createEpisodeRequestDTO.episodeNumber())
            .description(createEpisodeRequestDTO.description())
            .name(createEpisodeRequestDTO.name())
            .urlImages(createEpisodeRequestDTO.urlImages())
            .build();
  }

}
