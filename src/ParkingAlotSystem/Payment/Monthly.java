package ParkingAlotSystem.Payment;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.Vehicles.Bike;
import ParkingAlotSystem.Vehicles.Car;
import ParkingAlotSystem.Vehicles.Truck;
import ParkingAlotSystem.Vehicles.VehiclesType;

public class Monthly implements BillingModels{
    @Override
    public Double price(VehiclesType vehicle, Integer month) {
        if (vehicle instanceof Car) {
            return (((Car) vehicle).parkingSpots.getBasePrice() + 40.0) * month;
        } else if (vehicle instanceof Bike) {
            return (((Bike) vehicle).parkingSpots.getBasePrice() + 10.0) * month;
        } else if (vehicle instanceof Truck) {
            return (((Truck) vehicle).parkingSpots.getBasePrice() + 60.0) * month;
        } else  {
            return null;
        }
    }
}
