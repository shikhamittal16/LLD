package ParkingAlotSystem.Payment;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.Vehicles.Bike;
import ParkingAlotSystem.Vehicles.Car;
import ParkingAlotSystem.Vehicles.Truck;
import ParkingAlotSystem.Vehicles.VehiclesType;

public class Yearly implements BillingModels{

    @Override
    public Double price(VehiclesType vehicle, Integer years) {
        if (vehicle instanceof Car) {
            return (((Car) vehicle).parkingSpots.getBasePrice() + 30.0) * years;
        } else if (vehicle instanceof Bike) {
            return (((Bike) vehicle).parkingSpots.getBasePrice() + 5.0) * years;
        } else if (vehicle instanceof Truck) {
            return (((Truck) vehicle).parkingSpots.getBasePrice() + 50.0) * years;
        } else  {
            return null;
        }
    }
}
