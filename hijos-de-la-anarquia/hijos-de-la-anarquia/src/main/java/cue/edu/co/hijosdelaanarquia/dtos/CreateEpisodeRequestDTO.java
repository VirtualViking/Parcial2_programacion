package cue.edu.co.hijosdelaanarquia.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

import static cue.edu.co.hijosdelaanarquia.utils.constants.EpisodeConstant.*;

public record CreateEpisodeRequestDTO(
        @NotBlank(message = EPISODE_NAME_REQUIRED)
        String name,
        @NotBlank(message = EPISODE_DESCRIPTION_REQUIRED)
        String description,
        @NotNull(message = EPISODE_NUMBER_REQUIRED)
        Integer episodeNumber,
        @NotNull(message = EPISODE_URL_IMAGES_REQUIRED)
        List<String> urlImages
) {
}
