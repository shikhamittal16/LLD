package BookMyShow.Builders;

import BookMyShow.Entities.CinemaHall;
import BookMyShow.Entities.Movie;
import BookMyShow.Entities.Seats;
import BookMyShow.Entities.Show;

import java.util.Date;
import java.util.List;

public class ShowBuilder {
    Integer showId;
    Movie movie;
    Date startTime;
    Date endTime;
    CinemaHall cinemaPlayedAt;
    List<Seats> seats;

    public ShowBuilder setShowId(Integer showId) {
        this.showId = showId;
        return this;
    }

    public ShowBuilder setMovie(Movie movie) {
        this.movie = movie;
        return this;
    }

    public ShowBuilder setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public ShowBuilder setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public ShowBuilder setCinemaPlayedAt(CinemaHall cinemaPlayedAt) {
        this.cinemaPlayedAt = cinemaPlayedAt;
        return this;
    }

    public ShowBuilder setSeats(List<Seats> seats) {
        this.seats = seats;
        return this;
    }

    public Show getShow() {
        return new Show(showId, movie, startTime, endTime,  cinemaPlayedAt);
    }
}
