package cue.edu.co.hijosdelaanarquia.models;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "episodes")
public class SerieEpisode {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  private String name;
  private String description;
  private Integer episodeNumber;
  @ElementCollection
  private List<String> urlImages;
}

