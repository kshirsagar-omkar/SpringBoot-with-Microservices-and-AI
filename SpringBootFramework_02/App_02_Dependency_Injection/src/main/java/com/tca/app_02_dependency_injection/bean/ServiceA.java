package com.tca.app_02_dependency_injection.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceA {

    /*
    //Field Injection == allowed for private, final fields ---- does not work on *static fields* and static final
        @Autowired
        private ServiceB serviceB;

        public ServiceA() {
            System.out.println("ServiceA constructor");
        }
    */



    /*
    //Construction Injection ---- does not work on static final fields

        private ServiceB serviceB;

        @Autowired
        public ServiceA(ServiceB serviceB) {
            System.out.println("ServiceA parametrized constructor");
            this.serviceB = serviceB;
        }
    */



    //Setter Injection ---- does not work on static final fields

    private ServiceB serviceB;

    @Autowired
    public void setServiceB(ServiceB serviceB) {
        this.serviceB = serviceB;
    }



    public ServiceA() {
        System.out.println("ServiceA default constructor");
    }

    public void printMessage() {
        serviceB.printMessage();
    }

}
