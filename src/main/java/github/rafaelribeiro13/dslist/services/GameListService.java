package github.rafaelribeiro13.dslist.services;

import github.rafaelribeiro13.dslist.repositories.GameListRepository;
import github.rafaelribeiro13.dslist.services.gamelist.dto.GameListDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    private final GameListRepository repository;

    public GameListService(GameListRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameListDto> findAll() {
        return repository
                .findAll()
                .stream()
                .map(gameList -> GameListDto.from(gameList))
                .toList();
    }

}
