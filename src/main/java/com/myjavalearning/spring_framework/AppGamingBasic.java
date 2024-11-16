package com.myjavalearning.spring_framework;
import com.myjavalearning.spring_framework.game.*;

public class AppGamingBasic {
    public static void main(String[] args){
        MarioGame marioGame = new MarioGame();
        GameRunner gameRunner = new GameRunner(marioGame);

        gameRunner.run();
    }
}
