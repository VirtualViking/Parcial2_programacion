package cue.edu.co.hijosdelaanarquia.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.time.LocalDate;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "series")
public class Serie {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  private String name;
  private String description;
  private String creatorName;
  private String urlImage;

  @OneToMany
  @Cascade(CascadeType.ALL)
  private Set<Character> characters;

  @OneToMany
  @Cascade(CascadeType.ALL)
  private Set<SerieSeason> seasons;

  private SerieClassification classification;
  private LocalDate releaseDate;
}
