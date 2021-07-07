package movies;

public class Movie {

    private String name;
    private String movie;

    public Movie(String name, String movie) {
        this.name = name;
        this.movie = movie;
    }

    public Movie() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
