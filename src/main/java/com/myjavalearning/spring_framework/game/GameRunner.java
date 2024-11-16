package com.myjavalearning.spring_framework.game;

public class GameRunner {

    // The problem here is that SuperContra is tightly coupled so
    // We have to keep making changes to this class when we want to play a new game
    private SuperContra game;

    public GameRunner(SuperContra game){
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
