package StrategyDesignPattern.VehicleDrivingStrategies;

public class PassengerVehicle implements Vehicle{
    DriveStrategy driveStrategy;
    public PassengerVehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
