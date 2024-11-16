package com.myjavalearning.spring_framework;
import com.myjavalearning.spring_framework.game.*;

public class AppGamingBasic {
    public static void main(String[] args){
//        MarioGame game = new MarioGame();
//        SuperContraGame game = new SuperContraGame();
        PacManGame game = new PacManGame();

        // We would now say that the specific game or the IGamingConsole
        // is a dependency of the GameRunner class.
        // Here we are "injecting" the dependency into the GameRunner class.
        GameRunner gameRunner = new GameRunner(game);

        gameRunner.run();

        // Currently the object creation and the dependecy injection is written by us
        // lets get to a stage where the Spring framework can handle this for us

        // We want the spring framework to create these games for us and wire (inject dependencies)
        // them together as well

    }
}
