package ParkingAlotSystem.Vehicles;

import ParkingAlotSystem.Payment.BillingModels;

public class VehicleDetailsBuilder {
    private String vehicleId;
    private VehiclesType vehiclesType;
    private BillingModels billingModel;

    public VehicleDetailsBuilder setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
        return this;
    }

    public VehicleDetailsBuilder setVehicleType(VehiclesType vehiclesType) {
        this.vehiclesType = vehiclesType;
        return this;
    }

    public VehicleDetailsBuilder setBillingModel(BillingModels billingModel) {
        this.billingModel  = billingModel;
        return this;
    }

    public VehicleDetails getVehicleDetails() {
        return new VehicleDetails(vehicleId, vehiclesType, billingModel);
    }

}
