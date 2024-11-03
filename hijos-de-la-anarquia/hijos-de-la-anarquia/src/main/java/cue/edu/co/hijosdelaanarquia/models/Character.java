package cue.edu.co.hijosdelaanarquia.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "characters")
public class Character {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  private String name;
  private String urlImage;
  private String description;

}
