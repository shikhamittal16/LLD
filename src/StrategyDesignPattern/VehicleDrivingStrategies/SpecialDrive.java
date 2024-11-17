package StrategyDesignPattern.VehicleDrivingStrategies;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("special driving feature enable.....");
    }
}
