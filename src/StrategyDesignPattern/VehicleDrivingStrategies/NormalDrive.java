package StrategyDesignPattern.VehicleDrivingStrategies;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("normal driving feature enable.....");
    }
}
