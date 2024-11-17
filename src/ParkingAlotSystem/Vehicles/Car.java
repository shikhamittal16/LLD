package ParkingAlotSystem.Vehicles;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.ParkingSlots.Regular;

public class Car implements VehiclesType {
    public ParkingSpots parkingSpots = new Regular();

    public Car() {}

    @Override
    public Integer getTotalParkingCount(){
       return parkingSpots.totalParkingSpots();
    }

    @Override
    public Integer getAvailableParkingCount() {
        return parkingSpots.availableParkingSpots();
    }

    @Override
    public Boolean isParkingAvailable() {
        return parkingSpots.isParkingAvailable();
    }
}
