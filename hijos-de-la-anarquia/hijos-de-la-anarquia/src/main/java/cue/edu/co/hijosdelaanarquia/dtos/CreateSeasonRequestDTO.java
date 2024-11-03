package cue.edu.co.hijosdelaanarquia.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

import static cue.edu.co.hijosdelaanarquia.utils.constants.SeasonConstant.*;

public record CreateSeasonRequestDTO(
        @NotBlank(message = SEASON_URL_IMAGE_REQUIRED)
        String urlImage,
        @NotBlank(message = SEASON_DESCRIPTION_REQUIRED)
        String description,
        @NotNull(message = SEASON_NUMBER_REQUIRED)
        Integer number,
        @NotNull(message = SEASON_RELEASE_DATE_REQUIRED)
        LocalDate releaseDate
) {
}
