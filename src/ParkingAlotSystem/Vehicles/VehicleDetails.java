package ParkingAlotSystem.Vehicles;

public class VehicleDetails {
    private String vehicleId;
    private VehiclesType vehiclesType;
    public VehiclesType getVehiclesType() {
        return vehiclesType;
    }


    public VehicleDetails(String vehicleId, VehiclesType vehiclesType) {
        this.vehicleId = vehicleId;
        this.vehiclesType = vehiclesType;
    }

    @Override
    public String toString(){
        return "vehicle id:" + vehicleId ;
    }

}
