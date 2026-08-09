package com.tca.app_03_runnercomponent.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

    @Value("${name}")
    String name;

    @Value("${age}")
    Integer age;

    @Value("${per}")
    Double per;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getPer() {
        return per;
    }
}
