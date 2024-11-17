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
    private final Map<Class<? extends VehiclesType>, ParkingSpots> parkingMap = new HashMap<>();

    public ParkingLotManager() {
        parkingMap.put(Car.class, new Regular(10));
        parkingMap.put(Bike.class, new Compact(9));
        parkingMap.put(Truck.class, new Large(8));
    }

    public synchronized String parkVehicle(VehicleDetails vehicleDetails) {
        ParkingSpots spot = parkingMap.get(vehicleDetails.getVehiclesType().getClass());
        if (spot != null && spot.isParkingAvailable()) {
            spot.occupySpot();
            return "success";
        }
        return "Parking full for " + vehicleDetails.getVehiclesType().getClass().getSimpleName();
    }
}

