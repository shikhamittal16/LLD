package StrategyDesignPattern.VehicleDrivingStrategies;

public class VehicleMain {
    public static void main(String []arg) {
        PassengerVehicle passengerVehicle = new PassengerVehicle(new NormalDrive());
        System.out.println("For Passenger vehicles");
        passengerVehicle.drive();

        SportVehicles sportVehicles = new SportVehicles(new SpecialDrive());
        System.out.println("For Sports vehicles");
        sportVehicles.drive();

        OffRoadVehicles offRoadVehicles = new OffRoadVehicles(new SpecialDrive());
        System.out.println("For OffRoad Vehicles");
        offRoadVehicles.drive();
    }
}
