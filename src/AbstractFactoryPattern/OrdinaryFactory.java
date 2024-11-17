package AbstractFactoryPattern;

public class OrdinaryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String brandName) {
        if (brandName.equals("hyundai")) {
            return new Hyundai();
        } else if (brandName.equals("shift")) {
            return new Shift();
        } else {
            return null;
        }
    }
}
