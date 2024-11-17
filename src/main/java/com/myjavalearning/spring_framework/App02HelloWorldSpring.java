package com.myjavalearning.spring_framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

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

        // We can also retrieve beans by their type, so type.class
        Object theStringBeans = context.getBean(Address.class);

        System.out.println("Retrieved by type");
        System.out.println(theStringBeans);

        // Calling bean that is using a method call to use other beans
        Object thePersonWithMethodCall = context.getBean("person2MethodCall");

        System.out.println("\nMethod Call Bean");
        System.out.println(thePersonWithMethodCall);

        // Calling bean that is using parameters to use other beans
        Object thePersonWithParameter = context.getBean("person3Parameter");

        System.out.println("\nParameter Bean");
        System.out.println(thePersonWithParameter);

        // In order to get all beans managed by Spring we can use the
        // .getBeanDefinitionNames() function which in this case can be run on context

        String[] allBeans = context.getBeanDefinitionNames();

        for(String strBean : allBeans){
            System.out.println(strBean);
        }

        // What if we have beans that match
        System.out.println(context.getBean(Person.class));

    }
}
