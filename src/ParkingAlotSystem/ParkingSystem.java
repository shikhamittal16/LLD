package ParkingAlotSystem;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.Vehicles.VehiclesType;

public class ParkingSystem {
    private VehiclesType vehicle;
    private ParkingSpots parkingSpot;

    ParkingSystem(VehiclesType vehicle, ParkingSpots parkingSpots) {
        this.parkingSpot = parkingSpots;
        this.vehicle = vehicle;
    }

    public Integer getTotalParkingSlots() {
        return parkingSpot.totalParkingSpots();
    }

    public Integer getAvailableParkingSlots() {
        return parkingSpot.availableParkingSpots();
    }

    public Boolean isParkingAvailable() {
        return parkingSpot.isParkingAvailable();
    }

}
