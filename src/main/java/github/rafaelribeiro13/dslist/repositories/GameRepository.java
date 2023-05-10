package github.rafaelribeiro13.dslist.repositories;

import github.rafaelribeiro13.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true,
            value = "SELECT g.* FROM tb_game g " +
            "INNER JOIN tb_belonging b ON g.cd_game = b.cd_game " +
            "WHERE b.cd_game_list = :gameListId " +
            "ORDER BY b.qt_position")
    List<Game> findByGameList(Long gameListId);

}