package BookMyShow.Actors;

import BookMyShow.Entities.Account;
import BookMyShow.Entities.Address;
import BookMyShow.Entities.Booking;
import BookMyShow.Entities.Search;

public class SystemMember implements User {
    Account accountDetails;
    String memberName;
    String emailId;
    Address address;
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
