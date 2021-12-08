package fr.unilorraine.idmc.gamescatalog.business;

import fr.unilorraine.idmc.gamescatalog.business.exception.PublisherNotFound;
import fr.unilorraine.idmc.gamescatalog.business.port.GamesRepository;
import fr.unilorraine.idmc.gamescatalog.business.port.PublisherRepository;
import fr.unilorraine.idmc.gamescatalog.business.vo.Game;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class GamesCatalog {
    private final GamesRepository repo;
    private final PublisherRepository publisherRepo;

    public List<Game> findAll() {
        return repo.findAll();
    }

    public Game create(final Game newGame) {
        var publisher =
                publisherRepo
                        .findById(newGame.getPublisher().getId())
                        .orElseThrow(() -> PublisherNotFound.of(newGame));


        newGame.setPublisher(publisher);
        return repo.save(newGame);
    }
}
