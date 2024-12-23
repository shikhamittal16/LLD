package ZoomCars.Observable;


import ZoomCars.Inventory.Car;
import ZoomCars.Booking.Feedback;
import ZoomCars.Payments.Payment;
import ZoomCars.Users.User;
import ZoomCars.Booking.BookingStatus;

import java.util.Date;

public class Booking implements BookingObservable{
    Car carObj;
    User userDetail;
    Date pickupTime;
    Date dropoffTime;
    Payment paymentObj;
    BookingStatus bookingStatus;
    Integer rentalDuration;
    Feedback feedbackId;
    String cancelReason;
    Date cancelledTime;

    @Override
    public void notifyUser() {

    }
}
