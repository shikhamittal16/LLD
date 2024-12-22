package BookMyShow.Builders;

import BookMyShow.Entities.Movie;
import BookMyShow.Enums.Genre;
import java.util.Date;

public class MovieBuilder {
    Integer movieId;
    String movieName;
    Integer duration;
    Genre genre;
    Date releaseDate;
    String language;

    public MovieBuilder setMovieId(Integer movieId) {
        this.movieId = movieId;
        return this;
    }

    public MovieBuilder setMovieName(String movieName) {
        this.movieName = movieName;
        return this;
    }


    public MovieBuilder setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }


    public MovieBuilder setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public MovieBuilder setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public MovieBuilder setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Movie getMovieDetails(){
        return  new Movie(movieId,movieName, duration, genre, releaseDate, language );
    }
}
