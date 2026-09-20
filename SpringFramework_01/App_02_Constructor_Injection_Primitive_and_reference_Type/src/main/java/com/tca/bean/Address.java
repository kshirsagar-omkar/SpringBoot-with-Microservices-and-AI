package com.tca.bean;

public class Address {
    String city;
    String pincode;

    public Address(String city, String pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }
    
    public String getPincode() {
        return pincode;
    }
}
