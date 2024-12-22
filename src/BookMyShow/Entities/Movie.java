package BookMyShow.Entities;

import BookMyShow.Enums.Genre;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Movie {
    Integer movieId;
    String movieName;
    Integer duration;
    Genre genre;
    Date releaseDate;
    String language;

    public Movie(Integer movieId, String movieName, Integer duration, Genre genre, Date releaseDate, String language) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.duration = duration;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.language = language;
    }

    Map<String, List<Show>> movieShowsInCity;
}
