package com.tca.app_03_runnercomponent.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class MyRunner2 implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("===============================");

        System.out.println("MyRunner2 is running...");

        Set<String> lst = args.getOptionNames();

        for(String arg : lst){
            System.out.println("key :" + arg + " | value :" + args.getOptionValues(arg) );
        }


        System.out.println("==============================");
    }
}
