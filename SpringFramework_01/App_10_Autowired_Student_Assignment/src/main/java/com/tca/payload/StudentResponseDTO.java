package com.tca.payload;

public class StudentResponseDTO {
    private String name;
    private String city;
    private Double per;


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Double getPer() {
        return per;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPer(Double per) {
        this.per = per;
    }
}
