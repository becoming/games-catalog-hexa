package fr.unilorraine.idmc.gamescatalog.business.port;

import fr.unilorraine.idmc.gamescatalog.business.vo.Publisher;

import java.util.Optional;

public interface PublisherRepository {
    Optional<Publisher> findById(Long id);
}
