package ParkingAlotSystem.Vehicles;

public class VehicleDetailsBuilder {
    private String vehicleId;
    private VehiclesType vehiclesType;
    public VehicleDetailsBuilder setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
        return this;
    }

    public VehicleDetailsBuilder setVehicleType(VehiclesType vehiclesType) {
        this.vehiclesType = vehiclesType;
        return this;
    }

    public VehicleDetails getVehicleDetails() {
        return new VehicleDetails(vehicleId, vehiclesType);
    }

}
