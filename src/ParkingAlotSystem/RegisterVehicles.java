package ParkingAlotSystem;

import ParkingAlotSystem.Vehicles.*;

public class RegisterVehicles {
    private final ParkingLotManager parkingLotManager;

    public RegisterVehicles() {
        this.parkingLotManager = new ParkingLotManager();
    }

    public String registerVehicle(VehicleDetails vehicle) {
        return parkingLotManager.parkVehicle(vehicle);
    }
}

