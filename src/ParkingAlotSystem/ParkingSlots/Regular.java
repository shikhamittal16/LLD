package ParkingAlotSystem.ParkingSlots;

import ParkingAlotSystem.ParkingSlots.ParkingSpots;

import java.util.Objects;

public class Regular implements ParkingSpots {
    private Integer totalRegularParkingAvail;
    private Integer occupiedRegularParking;

    private final Double baseRent = 150.0;

    public Regular(){
        this.totalRegularParkingAvail = 0;
    }

    public Regular(Integer totalRegularParkingAvail) {
        this.totalRegularParkingAvail = totalRegularParkingAvail;
        this.occupiedRegularParking = 0;
    }

    @Override
    public Integer totalParkingSpots() {
        return totalRegularParkingAvail;
    }

    @Override
    public Integer availableParkingSpots() {
        return totalRegularParkingAvail - occupiedRegularParking;
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
            occupiedRegularParking++;
            System.out.println("Parking allocated to cars.");
        } else {
            System.out.println("Parking is already full for cars.");
        }
    }

    @Override
    public synchronized void releaseSpot() {
        if (occupiedRegularParking > 0) {
            occupiedRegularParking--;
        }
    }

    public void setTotalParkingAvail(Integer count) {
        this.totalRegularParkingAvail = count;
    }
}
