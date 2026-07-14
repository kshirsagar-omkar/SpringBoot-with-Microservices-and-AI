package com.tca.payload;



public class StudentRequestDTO {
    private String name;
    private String city;
    private Double per;
    private String batch;

    public String getBatch() {
        return batch;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Double getPer() {
        return per;
    }

    public void setBatch(String batch) {
        this.batch = batch;
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
