package github.rafaelribeiro13.dslist.services.game.dto;

import github.rafaelribeiro13.dslist.entities.Game;
import github.rafaelribeiro13.dslist.repositories.projections.GameMinProjection;

public record GameMinDto(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription
) {

    public static GameMinDto from(Game entity) {
        return new GameMinDto(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getImgUrl(),
                entity.getShortDescription()
        );
    }

    public static GameMinDto from(GameMinProjection projection) {
        return new GameMinDto(
                projection.getId(),
                projection.getTitle(),
                projection.getYear(),
                projection.getImgUrl(),
                projection.getShortDescription()
        );
    }

}
