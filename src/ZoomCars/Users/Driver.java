package ZoomCars.Users;

import ZoomCars.Inventory.Car;
import ZoomCars.Observable.Booking;

import java.util.List;

public class Driver {
    String driverLicense;
    String identityProof;
    Car assignedCar;
    Boolean isVerified;
    List<Booking> oldBookings;
}
