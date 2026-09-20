package com.tca.model;

import org.springframework.stereotype.Component;

@Component
public class Student {

    String name;
    String city;
    Double per;

    public Student() {
    }
    public Student(String name, String city, Double per) {
        this.name = name;
        this.city = city;
        this.per = per;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Double getPer() {
        return per;
    }
    public void setPer(Double per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", city=" + city + ", per=" + per + "]";
    }


}
