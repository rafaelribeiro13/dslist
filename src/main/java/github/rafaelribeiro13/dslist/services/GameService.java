package github.rafaelribeiro13.dslist.services;

import github.rafaelribeiro13.dslist.services.game.dto.GameDto;
import github.rafaelribeiro13.dslist.services.game.dto.GameMinDto;
import github.rafaelribeiro13.dslist.repositories.GameRepository;
import github.rafaelribeiro13.dslist.services.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    private final GameRepository repository;

    public GameService(GameRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll() {
        return repository.findAll()
                .stream()
                .map(game -> GameMinDto.from(game))
                .toList();
    }

    @Transactional(readOnly = true)
    public GameDto findById(Long id) {
        var game = repository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));

        return GameDto.from(game);
    }

}
