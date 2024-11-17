package ParkingAlotSystem.ParkingSlots;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;

import java.util.Objects;

public class Large implements ParkingSpots {
    private Integer totalLargeParkingAvail;
    private Integer occupiedLargeParking;

    private final Double baseRent = 200.0;

    public Large(){
        this.occupiedLargeParking = 0;
    };

    public Large(Integer totalLargeParkingAvail) {
        this.totalLargeParkingAvail = totalLargeParkingAvail;
        this.occupiedLargeParking = 0;
    }

    @Override
    public Integer totalParkingSpots() {
        return totalLargeParkingAvail;
    }

    @Override
    public Integer availableParkingSpots() {
        return totalLargeParkingAvail - occupiedLargeParking;
    }

    @Override
    public Boolean isParkingAvailable() {
        return availableParkingSpots() > 0;
    }


    @Override
    public Double getBasePrice() {
        return baseRent;
    }


    @Override
    public synchronized void occupySpot() {
        if (isParkingAvailable()) {
            occupiedLargeParking++;
            System.out.println("Parking allocated to trucks.");
        } else {
            System.out.println("Parking is already full for trucks.");
        }
    }

    @Override
    public synchronized void releaseSpot() {
        if (occupiedLargeParking > 0) {
            occupiedLargeParking--;
        }
    }

    public void setTotalParkingAvail(Integer count) {
        this.totalLargeParkingAvail = count;
    }

}
