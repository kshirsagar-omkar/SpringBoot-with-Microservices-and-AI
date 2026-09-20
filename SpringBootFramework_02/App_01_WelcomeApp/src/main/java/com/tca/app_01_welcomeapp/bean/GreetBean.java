package com.tca.app_01_welcomeapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class GreetBean {


    @Autowired
    private WelcomeBean welcomeBean;




    public GreetBean() {
        System.out.println("GreetBean Constructor called");
    }


    public void printWelcomeMessage() {
        welcomeBean.printWelcomeMessage();
    }

}
