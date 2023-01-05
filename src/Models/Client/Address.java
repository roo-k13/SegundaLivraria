package Models.Client;

import Models.PortugueseZipCode;
import Models.ZipCode;

public class Address {
    private String street;
    private int doorNumber;
    private String floor;
    private ZipCode zipCode;
    private String freguesia;
    private String concelho;

    public Address(String street, int doorNumber, int firstZipCodeValue, int secondZipCodeValue, String freguesia, String concelho) {
        this.street = street;
        this.doorNumber = doorNumber;
        zipCode = new PortugueseZipCode(firstZipCodeValue, secondZipCodeValue);
        this.freguesia = freguesia;
        this.concelho = concelho;
    }

    Address(String street, int doorNumber, String floor, int firstZipCodeValue, int secondZipCodeValue, String freguesia, String concelho) {
        this(street, doorNumber, firstZipCodeValue, secondZipCodeValue, freguesia, concelho);
        this.floor = floor;
    }

    public String toString() {
        String address = street + " " + doorNumber + ", ";
        if (floor != null) {
            address += floor = ", ";
        }
        address += zipCode.toString() + " " + freguesia + " " + concelho;
        return address;
    }
}