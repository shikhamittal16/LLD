package BookMyShow.Entities;

public class Address {
    String streetNo;
    String streetName;
    String pincode;
    String city;
    String country;

    public Address(String streetNo, String streetName, String pincode, String city, String country) {
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.pincode = pincode;
        this.city = city;
        this.country = country;
    }
}
