package cue.edu.co.hijosdelaanarquia.utils.initializers.builders;

import cue.edu.co.hijosdelaanarquia.models.*;
import cue.edu.co.hijosdelaanarquia.models.Character;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class SerieBuilder {
  public static  Serie buildSerie() {

    return Serie.builder()
            .id(1L)
            .name("Sons of Anarchy")
            .description("Sons of Anarchy is an American action crime drama television series created by Kurt Sutter that aired from 2008 to 2014.")
            .creatorName("Kurt Sutter")
            .urlImage("https://prod-ripcut-delivery.disney-plus.net/v1/variant/disney/C0D6A66619D2E18292D4978C4A811FBBD009D7F297E584FD4FDA8EF62DD7D46C/scale?width=506&aspectRatio=2.00&format=webp")
            .characters(buildCharacters())
            .seasons(buildSeasons())
            .classification(SerieClassification.PG13)
            .releaseDate(LocalDate.of(2008, 9, 3))
            .build();
  }

  private  static  Set<Character> buildCharacters() {

    return Set.of(
            Character.builder()
                    .name("Jax Teller")
                    .description("Jackson Nathaniel 'Jax' Teller is a fictional character and the protagonist on the FX television series Sons of Anarchy, played by Charlie Hunnam.")
                    .urlImage("https://th.bing.com/th/id/OIP.sNY6TL33sD7s-r-njK_27AHaJy?rs=1&pid=ImgDetMain.png")
                    .build(),
            Character.builder()
                    .name("Clay Morrow")
                    .description("Clarence 'Clay' Morrow is a fictional character and the main antagonist on the FX television series Sons of Anarchy, played by Ron Perlman.")
                    .urlImage("https://images2.fanpop.com/image/photos/13700000/Clay-Morrow-sons-of-anarchy-13713600-495-330.jpg")
                    .build(),
            Character.builder()
                    .name("Gemma Teller Morrow")
                    .description("Gemma Teller Morrow is a fictional character on the FX television series Sons of Anarchy, played by Katey Sagal.")
                    .urlImage("https://assets.fxnetworks.com/cms-next/production/df588433-fa8d-41f4-a5a7-0d605843312a.jpg")
                    .build(),
            Character.builder()
                    .name("Tara Knowles")
                    .description("Dr. Tara Grace Knowles-Teller is a fictional character on the FX drama Sons of Anarchy, played by Maggie Siff.")
                    .urlImage("https://images6.fanpop.com/image/photos/38500000/Maggie-Siff-as-Tara-Knowles-in-Sons-of-Anarchy-maggie-siff-38566277-2048-1536.jpg")
                    .build(),
            Character.builder()
                    .name("Opie Winston")
                    .description("Harry 'Opie' Winston is a fictional character on the FX television series Sons of Anarchy, played by Ryan Hurst.")
                    .urlImage("https://wallpapercave.com/wp/wp10400796.jpg")
                    .build(),
            Character.builder()
                    .name("Bobby Munson")
                    .description("Robert 'Bobby Elvis' Munson is a fictional character on the FX television series Sons of Anarchy, played by Mark Boone Junior.")
                    .urlImage("https://pixelz.cc/wp-content/uploads/2017/12/sons-of-anarchy-bobby-munson-uhd-4k-wallpaper.jpg")
                    .build(),
            Character.builder()
                    .name("Chibs Telford")
                    .description("Filip 'Chibs' Telford is a fictional character on the FX television series Sons of Anarchy, played by Tommy Flanagan.")
                    .urlImage("https://i.pinimg.com/originals/cb/56/73/cb567305084182f793f4b3d6b21cdca5.jpg")
                    .build(),
            Character.builder()
                    .name("Tig Trager")
                    .description("Alexander 'Tig' Trager is a fictional character on the FX television series Sons of Anarchy, played by Kim Coates.")
                    .urlImage("https://images2.fanpop.com/image/photos/13700000/Tig-Trager-sons-of-anarchy-13726418-300-385.jpg")
                    .build(),
            Character.builder()
                    .name("Juice Ortiz")
                    .description("Juan Carlos 'Juice' Ortiz is a fictional character on the FX television series Sons of Anarchy, played by Theo Rossi.")
                    .urlImage("https://images5.fanpop.com/image/photos/28700000/Juice-Ortiz-sons-of-anarchy-28708316-981-547.jpg")
                    .build());}

  private static Set<SerieSeason> buildSeasons() {
    return Set.of(
            SerieSeason
                    .builder()
                    .number(1)
                    .releaseDate(LocalDate.of(2008, 9, 3))
                    .urlImage("https://i.ytimg.com/vi/-Nv9YrZr3wE/maxresdefault.jpg")
                    .episodes(
                            Set.of(
                                    SerieEpisode.builder()
                                            .name("Pilot")
                                            .episodeNumber(1)
                                            .description("The Sons of Anarchy Motorcycle Club, Redwood Original (SAMCRO), is the one-percenter motorcycle club that operates in Charming, California, in the fictional universe of the show.")
                                            .urlImages(
                                                    List.of(
                                                            "https://i.ytimg.com/vi/yb1jjKcRYp0/maxresdefault.jpg",
                                                            "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/12a9a9d1f5d5358760d07897073f8f054098538f10eb53475b1f0ad209dc66e8._V_SX1080_.jpg"
                                                    )
                                            ).build(),
                                    SerieEpisode.builder()
                                            .name("Seeds")
                                            .episodeNumber(2)
                                            .description("The Sons of Anarchy Motorcycle Club, Redwood Original (SAMCRO), is the one-percenter motorcycle club that operates in Charming, California, in the fictional universe of the show.")
                                            .urlImages(
                                                    List.of(
                                                            "https://image.tmdb.org/t/p/original/6YZVXrSCUTRYXOiNAnAdBkwRtvC.jpg",
                                                            "https://media.distractify.com/brand-img/Z1A0v4L/0x0/sons-of-anarchy-netflix-1-1536079942722-1536079944762.jpg"
                                                    )
                                            ).build(),
                                    SerieEpisode.builder()
                                            .name("Fun Town")
                                            .episodeNumber(3)
                                            .description("The Sons of Anarchy Motorcycle Club, Redwood Original (SAMCRO), is the one-percenter motorcycle club that operates in Charming, California, in the fictional universe of the show.")
                                            .urlImages(
                                                    List.of(
                                                            "https://m.media-amazon.com/images/M/MV5BMzAwOWY2OTgtMzFjMS00OGViLWI5Y2ItMTFkOTFlY2Q0MGU0XkEyXkFqcGdeQXVyNzgxMzc3OTc@._V1_FMjpg_UX1000_.jpg",
                                                            "https://www.looper.com/img/gallery/criminal-minds-and-sons-of-anarchy-share-more-stars-than-you-probably-know/l-intro-1663351748.jpg"
                                                    )
                                            ).build()
                            )
                    )
                    .build(),
            SerieSeason.builder()
                    .number(2)
                    .releaseDate(LocalDate.of(2009, 9, 8))
                    .urlImage("https://is2-ssl.mzstatic.com/image/thumb/Music6/v4/ef/1d/8c/ef1d8cd7-ece4-e1ce-a9d3-34b91c71600e/source/3000x3000sr.jpg")
                    .episodes(
                            Set.of(
                                    SerieEpisode.builder()
                                            .name("Albification")
                                            .episodeNumber(1)
                                            .description("The Sons of Anarchy Motorcycle Club, Redwood Original (SAMCRO), is the one-percenter motorcycle club that operates in Charming, California, in the fictional universe of the show.")
                                            .urlImages(
                                                    List.of(
                                                            "https://image.tmdb.org/t/p/original/2761hpQAsY7ejx7ARvvbxn4a6nO.jpg",
                                                            "https://image.tmdb.org/t/p/w780/1swEtqZMgwupVEPUiCOYNdNTVQF.jpg"
                                                    )
                                            ).build(),
                                    SerieEpisode.builder()
                                            .name("Small Tears")
                                            .episodeNumber(2)
                                            .description("The Sons of Anarchy Motorcycle Club, Redwood Original (SAMCRO), is the one-percenter motorcycle club that operates in Charming, California, in the fictional universe of the show.")
                                            .urlImages(
                                                    List.of(
                                                            "https://image.tmdb.org/t/p/original/8ylRdHIC2D5MSvLd4WoepEnpfg4.jpg",
                                                            "https://fandomania.com/wp-content/uploads/2009/09/soa2-2.jpg"
                                                    )
                                            ).build(),
                                    SerieEpisode.builder()
                                            .episodeNumber(3)
                                            .name("Fix")
                                            .description("The Sons of Anarchy Motorcycle Club, Redwood Original (SAMCRO), is the one-percenter motorcycle club that operates in Charming, California, in the fictional universe of the show.")
                                            .urlImages(
                                                    List.of(
                                                            "https://image.tmdb.org/t/p/original/6NPMpRXXZu6epsPzuJF2ozA6jvP.jpg",
                                                            "https://image.tmdb.org/t/p/original/vjZ2SwFw2Lugn1k2frtkHEX1LYT.jpg"
                                                    )
                    )
                    .build()
                            )
    )
    .build()
    );
  }
}
