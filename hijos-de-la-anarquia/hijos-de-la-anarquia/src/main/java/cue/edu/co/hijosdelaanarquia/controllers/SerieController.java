package cue.edu.co.hijosdelaanarquia.controllers;

import cue.edu.co.hijosdelaanarquia.dtos.CreateEpisodeRequestDTO;
import cue.edu.co.hijosdelaanarquia.dtos.CreateSeasonRequestDTO;
import cue.edu.co.hijosdelaanarquia.exceptions.NotFoundException;
import cue.edu.co.hijosdelaanarquia.models.Serie;
import cue.edu.co.hijosdelaanarquia.services.SerieService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static cue.edu.co.hijosdelaanarquia.utils.constants.ExceptionConstant.SERIE_NOT_FOUND;

@RequestMapping("/series")
@RestController
@RequiredArgsConstructor
public class SerieController {
  private final SerieService serieService;

  @GetMapping("/{id}")
  public ResponseEntity<Serie> getSerie(@PathVariable Long id) {
    return ResponseEntity
            .ok(serieService.findById(id)
            .orElseThrow(() -> new NotFoundException(SERIE_NOT_FOUND)));
  }
  @PostMapping("/{serieId}/add-season")
  public ResponseEntity<Boolean> addSeason(@PathVariable Long serieId, @RequestBody @Valid CreateSeasonRequestDTO createSeasonRequestDTO) {
    return ResponseEntity.ok(
            serieService.addSeason(serieId, createSeasonRequestDTO)
    );
  }

  @PostMapping("/{serieId}/seasons/{seasonId}/add-episode")
  public ResponseEntity<Boolean> addEpisode(@PathVariable Long serieId, @PathVariable Long seasonId, @RequestBody @Valid CreateEpisodeRequestDTO createEpisodeRequestDTO) {
    return ResponseEntity.ok(
            serieService.addEpisode(serieId, seasonId, createEpisodeRequestDTO)
    );
  }

}
