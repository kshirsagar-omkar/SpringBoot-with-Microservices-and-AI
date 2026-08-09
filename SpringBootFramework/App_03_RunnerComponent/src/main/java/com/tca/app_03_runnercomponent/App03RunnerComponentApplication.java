package com.tca.app_03_runnercomponent;

import com.tca.app_03_runnercomponent.bean.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App03RunnerComponentApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App03RunnerComponentApplication.class, args);


        Properties properties = context.getBean(Properties.class);
        System.out.println("name : " + properties.getName());
        System.out.println("age : " + properties.getAge());
        System.out.println("per : " + properties.getPer());


    }

}
