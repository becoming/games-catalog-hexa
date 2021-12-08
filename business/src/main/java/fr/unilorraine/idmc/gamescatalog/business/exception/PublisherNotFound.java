package fr.unilorraine.idmc.gamescatalog.business.exception;

import fr.unilorraine.idmc.gamescatalog.business.vo.Game;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class PublisherNotFound extends RuntimeException {

    private final Long id;

    public static PublisherNotFound of(Game gg) {
        return new PublisherNotFound(gg.getPublisher().getId());
    }
}
