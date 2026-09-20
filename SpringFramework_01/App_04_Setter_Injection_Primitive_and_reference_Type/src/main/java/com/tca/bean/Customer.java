package com.tca.bean;

public class Customer {
    private String id;
    private String firstname;
    private Address address;





    public void setId(String id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAddress(Address address) {
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
