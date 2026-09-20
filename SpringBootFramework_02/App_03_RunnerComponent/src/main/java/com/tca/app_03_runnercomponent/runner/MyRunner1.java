package com.tca.app_03_runnercomponent.runner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(1) // specify the order of execution, lower numbers have higher priority
public class MyRunner1 implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("===============================");


        System.out.println("MyRunner1 is running...");

        for(String arg : args){
            System.out.println(arg);
        }

        System.out.println("===============================");
    }


}
