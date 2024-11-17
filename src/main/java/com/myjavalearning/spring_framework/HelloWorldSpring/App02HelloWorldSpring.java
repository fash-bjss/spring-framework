package com.myjavalearning.spring_framework.HelloWorldSpring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        // 1: Launch a spring context

        try( //try with resource
             // The try-with-resources statement, introduced in Java 7, simplifies resource
             // management by automatically closing resources that implement the AutoCloseable
             // interface. This feature eliminates the need for explicit finally blocks to close
             // resources, reducing boilerplate code and preventing resource leaks.
        AnnotationConfigApplicationContext context
                =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        ) {

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

            // Now we have set this to @Primary we shouldn't have any issues
            Object primaryPerson = context.getBean(Person.class);
            System.out.println(primaryPerson);

            // Now we have the qualifier we print out the bean using the qualifier
            Object personQualifier = context.getBean("person4Qualifier");
            System.out.println(personQualifier);
            System.out.println();
        } catch (BeansException e){ // We can catch a BeansException which needs to be imported
            System.out.println(e.getMessage());
        }
    }
}
