package github.rafaelribeiro13.dslist.controllers;

import github.rafaelribeiro13.dslist.services.game.dto.GameDto;
import github.rafaelribeiro13.dslist.services.game.dto.GameMinDto;
import github.rafaelribeiro13.dslist.services.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/games")
public class GameController {

    private final GameService service;

    public GameController(GameService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<GameMinDto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<GameDto> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

}
