package BookMyShow.Builders;

import BookMyShow.Entities.Audi;
import BookMyShow.Entities.Show;

import java.util.List;

public class AudiBuilder {
    Integer audiId;
    String audiName;

    List<Show> showName;
    Integer totalSeats;


    public AudiBuilder setAudiId(Integer audiId) {
        this.audiId = audiId;
        return this;
    }

    public AudiBuilder setAudiName(String audiName) {
        this.audiName = audiName;
        return this;
    }

    public AudiBuilder setShowName(List<Show> showName) {
        this.showName = showName;
        return this;
    }

    public AudiBuilder setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
        return this;
    }

    public Audi getAudi(){
        return new Audi(audiId, audiName, totalSeats);
    }
}

