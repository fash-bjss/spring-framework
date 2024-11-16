package com.myjavalearning.spring_framework.game;

public class SuperContraGame implements IGamingConsole {

    @Override
    public void up(){
        System.out.println("up");
    }

    @Override
    public void down(){
        System.out.println("Sit down");
    }

    @Override
    public void left(){
        System.out.println("Back");
    }

    @Override
    public void right(){
        System.out.println("Shoot a bullet");
    }
}
