package github.rafaelribeiro13.dslist.dtos;

import github.rafaelribeiro13.dslist.entities.Game;
import org.springframework.beans.BeanUtils;

public record GameDto(
        Long id,
        String title,
        Integer year,
        String genre,
        String platforms,
        Double score,
        String imgUrl,
        String shortDescription,
        String longDescription
) {

    public static GameDto from(Game entity) {
        return new GameDto(
                entity.getId(),
                entity.getTitle(),
                entity.getYear(),
                entity.getGenre(),
                entity.getPlatforms(),
                entity.getScore(),
                entity.getImgUrl(),
                entity.getShortDescription(),
                entity.getLongDescription()
        );
    }

}
