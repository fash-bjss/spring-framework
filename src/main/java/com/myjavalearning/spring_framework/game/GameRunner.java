package com.myjavalearning.spring_framework.game;

public class GameRunner {

    private MarioGame game;

    public GameRunner(MarioGame game){
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
