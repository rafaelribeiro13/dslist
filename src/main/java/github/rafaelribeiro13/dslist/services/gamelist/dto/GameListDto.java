package github.rafaelribeiro13.dslist.services.gamelist.dto;

import github.rafaelribeiro13.dslist.entities.GameList;

public record GameListDto(
        Long id,
        String name
) {

    public static GameListDto from(GameList entity) {
        return new GameListDto(entity.getId(), entity.getName());
    }

}
