package cue.edu.co.hijosdelaanarquia.controllers;

import cue.edu.co.hijosdelaanarquia.services.SerieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@AllArgsConstructor
public class IndexController {
  private final SerieService serieService;

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("serie", serieService.findById(1L).get());
    return "index";
  }

  @GetMapping("serie/{serieId}/seasons/{seasonId}")
  public String season(Model model, @PathVariable Long serieId, @PathVariable Long seasonId) {
    model.addAttribute("season", serieService.getSeason(serieId, seasonId));

    return "season-detail";
  }

}
