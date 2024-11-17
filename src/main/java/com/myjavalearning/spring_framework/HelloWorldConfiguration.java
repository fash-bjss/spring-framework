package com.myjavalearning.spring_framework;
//To indicate that this is a configuration class we add the @Configuration annotation

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Sade";
    }

    @Bean
    public int age(){
        return 65;
    }

    @Bean
    // in order to make the error go away we must annotate this as @primary
    @Primary
    public Person person(){
        return new Person("David", 45, new Address("45 Turner Lane", "Cardiff"));
    }

    // to customise the name of a bean you can add an attribute @Bean(name = "yourCustomName")
    @Bean(name = "mainAddress")
    @Primary
    public Address address(){
        return new Address("55 Park Way", "Lodnon");
    }

    @Bean(name = "address2")
    // Another way to use specific bean is to give it a qualifier
    @Qualifier("qualifierAddress2")
    public Address address2(){
        return new Address("Jacobs Avenenue", "New York");
    }

    // How about if we want to create another bean that is using an existing bean already managed by Spring
    // There are 2 ways:

    // 1: Method Calls - call the previous name() and age() bean.
    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    //2: Parameters - The second way to reuse pre-existing beans is using
    @Bean
    public Person person3Parameter(String name, int age, Address mainAddress){
        return new Person(name, age, mainAddress);
    }

    // now we can use the type with a qualifier to be auto wired in
    @Bean
    public Person person4Qualifier(String name, int age,  @Qualifier("qualifierAddress2") Address address){
        return new Person(name, age, address);
    }

}
