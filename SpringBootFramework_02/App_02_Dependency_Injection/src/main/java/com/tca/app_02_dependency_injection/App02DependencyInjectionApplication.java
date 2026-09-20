package com.tca.app_02_dependency_injection;

import com.tca.app_02_dependency_injection.bean.ServiceB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App02DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App02DependencyInjectionApplication.class, args);

        ServiceB serviceB = context.getBean(ServiceB.class);

        System.out.println("===========");
        serviceB.printMessage();
        System.out.println("===========");



    }

}
