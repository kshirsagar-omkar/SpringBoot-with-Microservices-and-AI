package com.tca;

import com.tca.beans.ReportManager;
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

        ReportManager  reportManager = (ReportManager) context.getBean("reportManager");

        reportManager.createReport();
    }
}
