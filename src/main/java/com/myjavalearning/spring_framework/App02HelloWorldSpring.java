package com.myjavalearning.spring_framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args){
        // 1: Launch a spring context
        AnnotationConfigApplicationContext context
                =  new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        // 2: Configure the things we want spring framework to manage
    }
}
