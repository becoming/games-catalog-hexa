package fr.unilorraine.idmc.gamescatalog.business.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class Game {

    private Long id;

    private String name;
    private Long price;
    private int rating;
    private String category;
    private Instant releaseDate;
    private Publisher publisher;

}
