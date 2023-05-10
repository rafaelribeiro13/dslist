package github.rafaelribeiro13.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging implements Serializable {

    @EmbeddedId
    @Column(name = "cd_belonging")
    private BelongingPK id = new BelongingPK();

    @Column(name = "qt_position")
    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList gameList) {
        id.setGame(game);
        id.setGameList(gameList);
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Belonging belonging = (Belonging) o;

        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
