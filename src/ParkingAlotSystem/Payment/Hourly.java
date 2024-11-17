package ParkingAlotSystem.Payment;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.Vehicles.Bike;
import ParkingAlotSystem.Vehicles.Car;
import ParkingAlotSystem.Vehicles.Truck;
import ParkingAlotSystem.Vehicles.VehiclesType;

public class Hourly implements BillingModels{
    @Override
    public Double price(VehiclesType vehicle, Integer hours) {
        if (vehicle instanceof Car) {
            return (((Car) vehicle).parkingSpots.getBasePrice() + 50.0) * hours;
        } else if (vehicle instanceof Bike) {
            return (((Bike) vehicle).parkingSpots.getBasePrice() + 20.0) * hours;
        } else if (vehicle instanceof Truck) {
            return (((Truck) vehicle).parkingSpots.getBasePrice() + 80.0) * hours;
        } else  {
            return null;
        }
    }
}
