package com.tca;

import com.tca.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Customer customer = (Customer) context.getBean("customer");

        System.out.println("customer id : " + customer.getId());
        System.out.println("customer firstname : " + customer.getFirstname());
        System.out.println("customer city : " + customer.getAddress().getCity());
        System.out.println("customer pincode : " + customer.getAddress().getPincode());
    }
}
