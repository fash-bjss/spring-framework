package com.myjavalearning.spring_framework.game;

public class PacManGame implements IGamingConsole {

    @Override
    public void up(){
        System.out.println("eat up");
    }

    @Override
    public void down(){
        System.out.println("eat down");
    }

    @Override
    public void left(){
        System.out.println("eat left");
    }

    @Override
    public void right(){
        System.out.println("eat right");
    }
}
