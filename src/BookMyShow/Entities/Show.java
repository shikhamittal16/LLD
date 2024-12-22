package BookMyShow.Entities;

import java.util.Date;
import java.util.List;

public class Show {
    Integer showId;
    Movie movie;
    Date startTime;
    Date endTime;
    CinemaHall cinemaPlayedAt;

    public Show(Integer showId, Movie movie, Date startTime, Date endTime, CinemaHall cinemaPlayedAt) {
        this.showId = showId;
        this.movie = movie;
        this.startTime = startTime;
        this.endTime = endTime;
        this.cinemaPlayedAt = cinemaPlayedAt;
    }

    List<Seats> seats;
}
