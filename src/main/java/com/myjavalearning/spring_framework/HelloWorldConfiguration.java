package com.myjavalearning.spring_framework;
//To indicate that this is a configuration class we add the @Configuration annotation

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
    public Person person(){
        return new Person("David", 45, new Address("45 Turner Lane", "Cardiff"));
    }

    // to customise the name of a bean you can add an attribute @Bean(name = "yourCustomName")
    @Bean(name = "mainAddress")
    public Address address(){
        return new Address("55 Park Way", "Lodnon");
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
}
