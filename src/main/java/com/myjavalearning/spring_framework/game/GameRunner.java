package com.myjavalearning.spring_framework.game;

public class GameRunner {

    // We create an interface IGamingConsole that our games can implement which means
    // We can pass in any game we like that implements the IGamingConsole interface
    private IGamingConsole game;

    public GameRunner(IGamingConsole game){
        this.game = game;
    }

    public void run(){
        System.out.printf("Running game %s\n", game);

        game.up();
        game.down();
        game.left();
        game.right();
    }
}
