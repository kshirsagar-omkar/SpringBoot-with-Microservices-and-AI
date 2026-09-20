package com.tca.app_01_welcomeapp;

import com.tca.app_01_welcomeapp.bean.GreetBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication // = ComponentScan + Configuration + EnableAutoConfiguration
public class App01WelcomeAppApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(App01WelcomeAppApplication.class, args);

        GreetBean greetBean = context.getBean(GreetBean.class);

        greetBean.printWelcomeMessage();


    }

}
