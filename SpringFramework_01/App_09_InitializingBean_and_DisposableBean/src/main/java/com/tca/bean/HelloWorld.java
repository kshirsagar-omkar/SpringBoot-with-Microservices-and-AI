package com.tca.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {

    private String message;

    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }



    //There are three ways to define init and destroy methods in Spring
    // 1. Through interfaces InitializingBean and DisposableBean
    // 2. Through custom methods
    // 3. Through annotations @PostConstruct and @PreDestroy

    //Priority will be for Interface and then custom method
    // And Annotations has the highest priority


    // Using interfaces InitializingBean and DisposableBean to define init and destroy methods
    // To use this we have to implements InitializingBean and DisposableBean interfaces in the class

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("HelloWorld afterPropertiesSet");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("HelloWorld destroy");
    }

    //========================================================



    // Using custom methods to define init and destroy methods
    // to use this we have to use init-method and destroy-method attribute in bean configuration
    // to use this we have to define methods in the class with any name and use that name in the bean configuration

    public void myInit(){
        System.out.println("HelloWorld myInit");
    }

    public void myDestory(){
        System.out.println("HelloWorld myDestory");
    }


}
