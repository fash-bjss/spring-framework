package com.myjavalearning.spring_framework.HelloWorldSpring;

// A record is a new feature introduced in JDK 16
// A record is a special type of class designed to hold immutable data (no setters).
// It automatically generates methods like constructors, getters, equals(), hasCode() and toString()
// reducing boilerplate code.

// Records are ideal for simple data carriers, making code cleaner and more concise

public record Person(String name, int age, Address address) {
    // record does not need a constructor
    // record does not need getters
}
