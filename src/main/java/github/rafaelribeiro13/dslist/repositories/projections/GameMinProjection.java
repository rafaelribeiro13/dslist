package github.rafaelribeiro13.dslist.repositories.projections;

public interface GameMinProjection {

    // get methods suffix must be equal to the name of the
    // fields returned in the projection
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();

}
