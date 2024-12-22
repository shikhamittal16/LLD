package BookMyShow.Builders;

import BookMyShow.Entities.Address;
import BookMyShow.Entities.Audi;
import BookMyShow.Entities.CinemaHall;

import java.util.List;

public class CinemaHallBuilder {
    Integer cinemaHallId;
    String cinemaName;
    Address address;

    List<Audi> audis;

    public CinemaHallBuilder setCinemaHallId(Integer cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
        return this;
    }

    public CinemaHallBuilder setAudis(List<Audi> audis) {
        this.audis = audis;
        return this;
    }

    public CinemaHallBuilder setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
        return this;
    }

    public CinemaHallBuilder setAddress(Address address) {
        this.address = address;
        return this;
    }

    public CinemaHall getCinemaHall() {
        return new CinemaHall(cinemaHallId, cinemaName, address);
    }
}
