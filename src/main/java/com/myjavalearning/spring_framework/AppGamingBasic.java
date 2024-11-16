package com.myjavalearning.spring_framework;
import com.myjavalearning.spring_framework.game.*;

public class AppGamingBasic {
    public static void main(String[] args){
//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
        PacManGame game = new PacManGame();
        GameRunner gameRunner = new GameRunner(game);

        gameRunner.run();
    }
}
