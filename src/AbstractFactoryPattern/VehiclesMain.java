package AbstractFactoryPattern;

public class VehiclesMain implements ParentFactory{
    @Override
    public VehicleFactory getVehicleFactory(String vehicleBrand) {
        switch (vehicleBrand){
            case "mercedes" : {
                return new LuxuryFactory();
            }
            case "bmw" : {
                return new LuxuryFactory();
            }
            case "shift" : {
                return new OrdinaryFactory();
            }
            case "hyundai" : {
                return new OrdinaryFactory();
            }
            default:{
                return null;
            }
        }
    }

    public static void main(String []arg) {
        VehiclesMain obj = new VehiclesMain();
        VehicleFactory veh1 = obj.getVehicleFactory("mercedes");
        veh1.getVehicle("mercedes").display();
        VehicleFactory veh2 = obj.getVehicleFactory("shift");
        veh2.getVehicle("shift").display();
    }
}
