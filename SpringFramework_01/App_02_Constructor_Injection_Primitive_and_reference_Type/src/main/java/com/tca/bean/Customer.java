package com.tca.bean;

public class Customer {
    private String id;
    private String firstname;
    private Address address;

    public Customer(String id, String firstname, Address address) {
        this.id = id;
        this.firstname = firstname;
        this.address = address;
    }

    public  String getId() {
        return id;
    }
    public String getFirstname() {
        return firstname;
    }

    public Address getAddress() {
        return address;
    }
}
