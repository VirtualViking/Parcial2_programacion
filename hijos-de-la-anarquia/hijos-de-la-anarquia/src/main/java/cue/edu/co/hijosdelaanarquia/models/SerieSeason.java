package cue.edu.co.hijosdelaanarquia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Entity(name = "seasons")
public class SerieSeason {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  private Integer number;
  private String urlImage;
  @OneToMany
  @Cascade(CascadeType.ALL)
  private Set<SerieEpisode> episodes;
  private LocalDate releaseDate;

}
