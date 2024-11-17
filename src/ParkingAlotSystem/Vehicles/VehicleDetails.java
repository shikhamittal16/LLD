package ParkingAlotSystem.Vehicles;

import ParkingAlotSystem.Payment.BillingModels;

public class VehicleDetails {
    private String vehicleId;
    private VehiclesType vehiclesType;
    private BillingModels billingModel;

    public VehiclesType getVehiclesType() {
        return vehiclesType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public BillingModels getBillingModel() {
        return billingModel;
    }

    public void setBillingModel(BillingModels billingModel) {
        this.billingModel = billingModel;
    }

    public void setVehiclesType(VehiclesType vehiclesType) {
        this.vehiclesType = vehiclesType;
    }

    public VehicleDetails(String vehicleId, VehiclesType vehiclesType, BillingModels billingModel) {
        this.vehicleId = vehicleId;
        this.vehiclesType = vehiclesType;
        this.billingModel = billingModel;
    }

    @Override
    public String toString(){
        return "vehicle id:" + vehicleId ;
    }

}
