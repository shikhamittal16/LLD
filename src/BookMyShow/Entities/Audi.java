package BookMyShow.Entities;

import java.util.List;

public class Audi {
    Integer audiId;
    String audiName;

    List<Show> showName;
    Integer totalSeats;

    public Audi(Integer audiId, String audiName, Integer totalSeats) {
        this.audiId = audiId;
        this.audiName = audiName;
        this.totalSeats = totalSeats;
    }
}
