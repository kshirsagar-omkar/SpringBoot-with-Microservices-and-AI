package com.tca;

import com.tca.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        try{
            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


            HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

            System.out.println(helloWorld.getMessage());


            //You get error because close() method is not present in ApplicationContext
            //It is present in Implementation class
            //context.close();

            //ThereFore use downcasting to close the context

            ((ClassPathXmlApplicationContext) context).close();




        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
