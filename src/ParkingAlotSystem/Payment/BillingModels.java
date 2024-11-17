package ParkingAlotSystem.Payment;

import ParkingAlotSystem.Vehicles.VehiclesType;

public interface BillingModels {
    public Double price(VehiclesType vehicle, Integer count);
}
