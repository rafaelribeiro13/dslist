package github.rafaelribeiro13.dslist.controllers;

import github.rafaelribeiro13.dslist.services.GameListService;
import github.rafaelribeiro13.dslist.services.gamelist.dto.GameListDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/lists")
public class GameListController {

    private final GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping
    public ResponseEntity<List<GameListDto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(gameListService.findAll());
    }

}
