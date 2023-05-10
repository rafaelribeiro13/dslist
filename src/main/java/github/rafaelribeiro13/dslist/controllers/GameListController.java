package github.rafaelribeiro13.dslist.controllers;

import github.rafaelribeiro13.dslist.services.GameListService;
import github.rafaelribeiro13.dslist.services.GameService;
import github.rafaelribeiro13.dslist.services.game.dto.GameMinDto;
import github.rafaelribeiro13.dslist.services.gamelist.dto.GameListDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameListDto>> findAll() {
        return ResponseEntity.status(HttpStatus.OK).body(gameListService.findAll());
    }

    @GetMapping(path = "/{gameListId}/games")
    public ResponseEntity<List<GameMinDto>> findAllGamesById(@PathVariable Long gameListId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(gameService.findAllByGameList(gameListId));
    }

}
