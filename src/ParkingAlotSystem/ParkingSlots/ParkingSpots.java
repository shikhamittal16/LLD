package ParkingAlotSystem.ParkingSlots;

//public interface ParkingSpots {
//    Integer totalParkingSpots();
//
//    Integer availableParkingSpots();
//
//    Boolean isParkingAvailable();
//
//    Double getBasePrice();
//
//    void registerParking();
//
//    void setTotalParkingAvail(Integer count);
//
//    void setOccupiedParking(Integer count);
//}
public interface ParkingSpots {
    Integer totalParkingSpots();
    Integer availableParkingSpots();
    Boolean isParkingAvailable();
    Double getBasePrice();
    void occupySpot();
    void releaseSpot();
}
