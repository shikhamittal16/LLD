package StrategyDesignPattern.VehicleDrivingStrategies;

public class SportVehicles implements Vehicle{
    DriveStrategy driveStrategy;
    public SportVehicles(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
