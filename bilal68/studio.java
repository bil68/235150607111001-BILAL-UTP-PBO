import java.util.ArrayList;

public class Studio {
    private String name;
    private ArrayList<Movie> movies;

    public Studio(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }
}