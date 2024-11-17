package AbstractFactoryPattern;

public interface ParentFactory {
    VehicleFactory getVehicleFactory(String vehicleBrand);
}
