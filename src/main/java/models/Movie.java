package models;

public class Movie {
    Integer id;
    String title;
    Integer runtime;
    Integer imdbscore;
    Integer releaseyear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Integer getImdbscore() {
        return imdbscore;
    }

    public void setImdbscore(Integer imdbscore) {
        this.imdbscore = imdbscore;
    }

    public Integer getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(Integer releaseyear) {
        this.releaseyear = releaseyear;
    }
}
