package github.rafaelribeiro13.dslist.repositories;

import github.rafaelribeiro13.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
