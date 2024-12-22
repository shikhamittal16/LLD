package BookMyShow.Actors;

import BookMyShow.Entities.Booking;
import BookMyShow.Entities.Search;

public class Guest implements User{
    Integer userId;
    Search searchObj;
    @Override
    public Integer getUserId() {
        return userId;
    }

    @Override
    public Search getSearchObject() {
        return searchObj;
    }

    public Booking makeBooking(){
        return null;
    }
}
