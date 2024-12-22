package BookMyShow.Entities;

import BookMyShow.Actors.Guest;
import BookMyShow.Actors.User;
import BookMyShow.Enums.BookingStatus;

import java.util.Date;
import java.util.List;

public class Booking {
    Double totalPrice;
    List<Seats> totalSeats;
    Show showName;
    Audi audiName;
    Date bookingDate;
    Payment paymentObj;
    BookingStatus bookingStatus;
    User userObj;
}
