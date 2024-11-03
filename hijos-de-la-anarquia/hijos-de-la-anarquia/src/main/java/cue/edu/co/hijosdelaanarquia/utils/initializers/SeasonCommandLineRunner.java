package cue.edu.co.hijosdelaanarquia.utils.initializers;

import cue.edu.co.hijosdelaanarquia.utils.initializers.builders.SerieBuilder;
import cue.edu.co.hijosdelaanarquia.services.SerieService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SeasonCommandLineRunner implements CommandLineRunner {
  private final SerieService serieService;

  @Override
  public void run(String... args) throws Exception {
    if(serieService.findById(1L).isPresent()) return;

    serieService.save(SerieBuilder.buildSerie());
  }
}
