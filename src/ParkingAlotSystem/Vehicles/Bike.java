package ParkingAlotSystem.Vehicles;

import ParkingAlotSystem.ParkingSlots.Compact;
import ParkingAlotSystem.ParkingSlots.ParkingSpots;

public class Bike implements VehiclesType {
    public ParkingSpots parkingSpots = new Compact();

    public Bike() {}

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
