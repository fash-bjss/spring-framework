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
        return new Person("David", 45);
    }

    // to customise the name of a bean you can add an attribute @Bean(name = "yourCustomName")
    @Bean(name = "mainAddress")
    public Address address(){
        return new Address("55 Park Way", "Lodnon");
    }
}
