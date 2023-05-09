package github.rafaelribeiro13.dslist.dtos;

import github.rafaelribeiro13.dslist.entities.Game;

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

}
