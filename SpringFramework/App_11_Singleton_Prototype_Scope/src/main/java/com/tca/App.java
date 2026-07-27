package com.tca;

import com.tca.config.Config;
import com.tca.service.ServiceA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);


        /*
        =================== singleton ================

        ONLY ONE OBJECT IS CREATED PER CONTAINER

        ==============================================

         */


        //Case 1:
        // If you dont write @Scope with singleton, it will be singleton by default
        // So object will create at starting of application

        //Case 2:
        // If you write @Lazy to class, then object will create when you call getBean method
        // For singleton by default it is Eager initialization, but if you write @Lazy then it will be Lazy initialization




        /*
        =================== prototype ================

        OBJECT IS CREATED EVERY TIME WHEN YOU CALL getBean() METHOD

        ==============================================

         */

        // Case 1:
        // If you write @Scope("prototype") to class, then object will create every time when you call getBean() method

        ServiceA serviceA1 = context.getBean(ServiceA.class);
        ServiceA serviceA2 = context.getBean(ServiceA.class);


        System.out.println( "====bye====" );
    }
}
