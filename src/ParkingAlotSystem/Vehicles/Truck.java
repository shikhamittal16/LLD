package ParkingAlotSystem.Vehicles;

import ParkingAlotSystem.ParkingSlots.Large;
import ParkingAlotSystem.ParkingSlots.ParkingSpots;

public class Truck implements VehiclesType {
    public ParkingSpots parkingSpots = new Large();

    public Truck() {}

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
