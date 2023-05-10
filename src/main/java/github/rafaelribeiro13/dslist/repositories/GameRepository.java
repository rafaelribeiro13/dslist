package github.rafaelribeiro13.dslist.repositories;

import github.rafaelribeiro13.dslist.entities.Game;
import github.rafaelribeiro13.dslist.repositories.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true,
            value = "SELECT " +
            "g.cd_game AS `id`, g.ds_title AS `title`, g.aa_game AS `year`, g.ds_img_url AS `imgUrl`" +
            ", g.ds_short_description AS `shortDescription`, b.qt_position AS `position` " +
            "FROM tb_game g " +
            "INNER JOIN tb_belonging b ON g.cd_game = b.cd_game " +
            "WHERE b.cd_game_list = :gameListId " +
            "ORDER BY b.qt_position")
    List<GameMinProjection> findByGameList(Long gameListId);

}