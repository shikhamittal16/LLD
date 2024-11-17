package ParkingAlotSystem.Payment;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.Vehicles.Bike;
import ParkingAlotSystem.Vehicles.Car;
import ParkingAlotSystem.Vehicles.Truck;
import ParkingAlotSystem.Vehicles.VehiclesType;

public class Hourly implements BillingModels{
    @Override
    public Double price(VehiclesType vehicle, Integer hours) {
        return 100.0;
    }
}
