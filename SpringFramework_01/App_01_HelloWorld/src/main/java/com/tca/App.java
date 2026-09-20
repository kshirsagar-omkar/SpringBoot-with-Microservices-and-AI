package com.tca;

import com.tca.bean.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        try{

            //Step 1: Creating and starting container

            ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");


            //Step 2: Getting Object from Spring container and *down* typecasting to HelloWorld class

            HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");

            //Step 3: Access Service of HelloWorld

            System.out.println(helloWorld.sayHello());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
