package StrategyDesignPattern.VehicleDrivingStrategies;

public class OffRoadVehicles implements Vehicle{
    DriveStrategy driveStrategy;

    public OffRoadVehicles(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    @Override
    public void drive() {
        driveStrategy.drive();
    }
}
