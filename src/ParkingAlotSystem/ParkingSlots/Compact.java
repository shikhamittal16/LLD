package ParkingAlotSystem.ParkingSlots;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;

import java.util.Objects;

public class Compact implements ParkingSpots {
    private Integer totalCompactParkingAvail;
    private Integer occupiedCompactParking;
    private final Double baseRent = 100.0;

    public Compact() {
        this.occupiedCompactParking = 0;
    }

    @Override
    public Integer totalParkingSpots() {
        return totalCompactParkingAvail;
    }

    @Override
    public Integer availableParkingSpots() {
        return totalCompactParkingAvail - occupiedCompactParking;
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
            occupiedCompactParking++;
            System.out.println("Parking allocated to bike.");
        } else {
            System.out.println("Parking is already full for bikes.");
        }
    }

    @Override
    public synchronized void releaseSpot() {
        if (occupiedCompactParking > 0) {
            occupiedCompactParking--;
        }
    }

    public void setTotalParkingAvail(Integer count) {
        this.totalCompactParkingAvail = count;
    }
}
