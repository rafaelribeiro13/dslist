package github.rafaelribeiro13.dslist.repositories;

import github.rafaelribeiro13.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}