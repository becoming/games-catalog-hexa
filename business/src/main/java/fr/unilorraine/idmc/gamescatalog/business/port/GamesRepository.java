package fr.unilorraine.idmc.gamescatalog.business.port;

import fr.unilorraine.idmc.gamescatalog.business.vo.Game;

import java.util.List;

public interface GamesRepository {
    List<Game> findAll();

    Game save(Game newGame);
}
