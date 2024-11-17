package AbstractFactoryPattern;

public class LuxuryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String brandName) {
        if (brandName.equals("mercedes")) {
            return new Mercedes();
        } else if (brandName.equals("bmw")) {
            return new BMW();
        } else {
            return null;
        }
    }
}
