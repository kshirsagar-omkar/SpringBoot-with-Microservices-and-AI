package com.tca.app_01_welcomeapp.bean;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {

    public WelcomeBean() {
        System.out.println("WelcomeBean Constructor called");
    }

    public void printWelcomeMessage() {
        System.out.println("WelcomeBean cha WelcomeMessage");
    }

}
