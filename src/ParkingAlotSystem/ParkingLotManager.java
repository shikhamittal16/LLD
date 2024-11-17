package ParkingAlotSystem;

import AbstractFactoryPattern.Vehicle;
import ParkingAlotSystem.ParkingSlots.Compact;
import ParkingAlotSystem.ParkingSlots.Large;
import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.ParkingSlots.Regular;
import ParkingAlotSystem.Vehicles.*;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotManager {
    private final Map parkingMap = new HashMap();

    public ParkingLotManager() {
        parkingMap.put(Car.class, new Regular());
        parkingMap.put(Bike.class, new Compact());
        parkingMap.put(Truck.class, new Large());
    }

    public String parkVehicle(VehicleDetails vehicleDetails) {
        ParkingSpots spot = (ParkingSpots) parkingMap.get(vehicleDetails.getVehiclesType().getClass());
        if (spot != null && spot.isParkingAvailable()) {
            spot.occupySpot();
            return "success";
        }
        return "Parking full for " + vehicleDetails.getVehiclesType().getClass().getSimpleName();
    }
}
