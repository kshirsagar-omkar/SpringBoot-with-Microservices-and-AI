package com.tca.app_02_dependency_injection.bean;

import org.springframework.stereotype.Component;

@Component
public class ServiceB {

    public ServiceB() {
        System.out.println("ServiceB constructor");
    }


    public void printMessage() {
        System.out.println("ServiceB: Hello from ServiceB!");
    }

}
