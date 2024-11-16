package com.myjavalearning.spring_framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        // 1: Launch a spring context
        AnnotationConfigApplicationContext context
                =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // 2: Configure the things we want spring framework to manage
        // created HelloWorldConfiguration - @Configuration
        // created a spring bean called name - @Bean

        // 3: Now we are retrieving the Beans managed by Spring
        // In order for us to see what beans Spring is managing we can use the .getBean() method
        // calling it on the context created above context.getBean()
        Object theNameBean = context.getBean("name");
        Object theAgeBean = context.getBean("age");
        Object thePersonBean = context.getBean("person");

        // Challenge create the address record and bean
        Object theAddressBean = context.getBean("mainAddress");

        System.out.println(theNameBean);
        System.out.println(theAgeBean);
        System.out.println(thePersonBean);
        System.out.println(theAddressBean);

    }
}
