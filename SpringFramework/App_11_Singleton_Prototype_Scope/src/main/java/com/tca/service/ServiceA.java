package com.tca.service;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//By default Singleton scope
//@Scope("singleton")
//@Lazy
@Scope("prototype")
public class ServiceA {
    public ServiceA(){
        System.out.println("ServiceA");
    }
}
