package BookMyShow.Entities;

import BookMyShow.Entities.Address;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class CinemaHall {
    Integer cinemaHallId;
    String cinemaName;
    Address address;

    public void setAudis(List<Audi> audis) {
        this.audis = audis;
    }

    List<Audi> audis;

    public List<Audi> getAudis() {
        return audis;
    }

    public CinemaHall(Integer cinemaHallId, String cinemaName, Address address) {
        this.cinemaHallId = cinemaHallId;
        this.cinemaName = cinemaName;
        this.address = address;
    }

//    public Map<Date,Movie> getMovies(List<Date> dateList){
//
//    }
//    public Map<Date,Show> getShows(List<Date> dateList){
//
//    }
}
