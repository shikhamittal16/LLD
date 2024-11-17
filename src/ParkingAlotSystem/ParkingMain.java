package ParkingAlotSystem;

import ParkingAlotSystem.ParkingSlots.Compact;
import ParkingAlotSystem.ParkingSlots.Large;
import ParkingAlotSystem.ParkingSlots.ParkingSpots;
import ParkingAlotSystem.ParkingSlots.Regular;
import ParkingAlotSystem.Payment.Hourly;
import ParkingAlotSystem.Payment.Monthly;
import ParkingAlotSystem.Payment.Yearly;
import ParkingAlotSystem.Vehicles.*;

import java.util.ArrayList;
import java.util.List;

public class ParkingMain {
    public static void main(String []arg) throws InterruptedException {
        ParkingSpots regularParkings = new Regular();  // parking for cars
        ParkingSpots compactParkings =new Compact(); // parking for bikes
        ParkingSpots largeParkings = new Large(); // parking for trucks

        List<VehicleDetails> registerCarsList = new ArrayList<>();
        List<VehicleDetails> registerBikesList = new ArrayList<>();
        List<VehicleDetails> registerTrucksList = new ArrayList<>();

        Runnable registerCarsTask = () -> {
            Integer vehicleId = 101;
            for (int i=0 ; i<10; i++) {
//              ----------- here i am using builder design pattern -------------
                VehicleDetails vehicleDetails = new VehicleDetailsBuilder()
                        .setVehicleId(vehicleId.toString())
                        .setVehicleType(new Car()).setBillingModel(new Monthly())
                        .getVehicleDetails();
                RegisterVehicles registerNewCar = new RegisterVehicles();
                String status = registerNewCar.registerVehicle(vehicleDetails);
                if (status.equals("success")) {
                    registerCarsList.add(vehicleDetails);
                    vehicleId++;
                } else {
                    System.out.println(status);
                }
            }
        };
        Runnable registerBikesTask = () -> {
            Integer vehicleId = 201;
            for (int i=0 ; i<10; i++) {
//              ----------- here i am using builder design pattern -------------
                VehicleDetails vehicleDetails = new VehicleDetailsBuilder()
                        .setVehicleId(vehicleId.toString())
                        .setVehicleType(new Bike()).setBillingModel(new Hourly())
                        .getVehicleDetails();
                RegisterVehicles registerNewBike = new RegisterVehicles();
                String status = registerNewBike.registerVehicle(vehicleDetails);
                if (status.equals("success")) {
                    registerBikesList.add(vehicleDetails);
                    vehicleId++;
                } else {
                    System.out.println(status);
                }
            }
        };
        Runnable registerTrucksTask = () -> {
            Integer vehicleId = 301;
            for (int i=0 ; i<10; i++) {
//              ----------- here i am using builder design pattern -------------
                VehicleDetails vehicleDetails = new VehicleDetailsBuilder()
                        .setVehicleId(vehicleId.toString())
                        .setVehicleType(new Truck()).setBillingModel(new Yearly())
                        .getVehicleDetails();
                RegisterVehicles registerNewTruck = new RegisterVehicles();
                String status = registerNewTruck.registerVehicle(vehicleDetails);
                if (status.equals("success")) {
                    registerTrucksList.add(vehicleDetails);
                    vehicleId++;
                }else {
                    System.out.println(status);
                }
            }
        };

        Thread thread1 = new Thread(registerCarsTask);
        Thread thread2 = new Thread(registerBikesTask);
        Thread thread3 = new Thread(registerTrucksTask);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

//      traversing lists

        System.out.println("Registered cars:");
        for (VehicleDetails car : registerCarsList) {
            System.out.println(car);
        }

        System.out.println("Registered bikes:");
        for (VehicleDetails bike : registerBikesList) {
            System.out.println(bike);
        }

        System.out.println("Registered Trucks:");
        for (VehicleDetails truck : registerTrucksList) {
            System.out.println(truck);
        }
    }
}
