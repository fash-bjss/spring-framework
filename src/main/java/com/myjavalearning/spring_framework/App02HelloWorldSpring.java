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
        Object theBean = context.getBean("name");

        System.out.println(theBean);

    }
}
