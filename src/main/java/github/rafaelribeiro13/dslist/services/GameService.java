package github.rafaelribeiro13.dslist.services;

import github.rafaelribeiro13.dslist.dtos.GameMinDto;
import github.rafaelribeiro13.dslist.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    public List<GameMinDto> findAll() {
        return repository.findAll()
                .stream()
                .map(game -> GameMinDto.from(game))
                .toList();
    }

}
