package ParkingAlotSystem;

import ParkingAlotSystem.Vehicles.*;

public class RegisterVehicles {
    private final ParkingLotManager parkingLotManager;

    public RegisterVehicles(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public String registerVehicle(VehicleDetails vehicle) {
        return parkingLotManager.parkVehicle(vehicle);
    }
}

