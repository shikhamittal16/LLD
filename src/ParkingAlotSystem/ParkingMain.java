package ParkingAlotSystem;
import ParkingAlotSystem.Payment.BillingModels;
import ParkingAlotSystem.Payment.Hourly;
import ParkingAlotSystem.Payment.Monthly;
import ParkingAlotSystem.Payment.Yearly;
import ParkingAlotSystem.Vehicles.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingMain {
    public static void main(String[] args) throws InterruptedException {
        ParkingLotManager parkingLotManager = new ParkingLotManager();

        List<VehicleDetails> registerCarsList = new ArrayList<>();
        List<VehicleDetails> registerBikesList = new ArrayList<>();
        List<VehicleDetails> registerTrucksList = new ArrayList<>();

        Runnable registerCarsTask = createRegisterTask(registerCarsList, new Car(), new Monthly(), parkingLotManager, 101);
        Runnable registerBikesTask = createRegisterTask(registerBikesList, new Bike(), new Hourly(), parkingLotManager, 201);
        Runnable registerTrucksTask = createRegisterTask(registerTrucksList, new Truck(), new Yearly(), parkingLotManager, 301);

        Thread thread1 = new Thread(registerCarsTask);
        Thread thread2 = new Thread(registerBikesTask);
        Thread thread3 = new Thread(registerTrucksTask);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        printRegisteredVehicles("Registered cars", registerCarsList);
        printRegisteredVehicles("Registered bikes", registerBikesList);
        printRegisteredVehicles("Registered trucks", registerTrucksList);
    }

    private static Runnable createRegisterTask(List<VehicleDetails> registerList, VehiclesType vehicleType,
                                               BillingModels billingModel, ParkingLotManager parkingLotManager,
                                               int startId) {
        return () -> {
            int vehicleId = startId;
            for (int i = 0; i < 10; i++) {
                VehicleDetails vehicleDetails = new VehicleDetailsBuilder()
                        .setVehicleId(String.valueOf(vehicleId))
                        .setVehicleType(vehicleType)
                        .setBillingModel(billingModel)
                        .getVehicleDetails();
                RegisterVehicles registerNewVehicle = new RegisterVehicles(parkingLotManager);
                String status = registerNewVehicle.registerVehicle(vehicleDetails);
                if ("success".equals(status)) {
                    registerList.add(vehicleDetails);
                    vehicleId++;
                } else {
                    System.out.println(status);
                }
            }
        };
    }

    private static void printRegisteredVehicles(String title, List<VehicleDetails> vehicleList) {
        System.out.println(title + ":");
        for (VehicleDetails vehicle : vehicleList) {
            System.out.println(vehicle);
        }
    }
}

