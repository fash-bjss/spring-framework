// GameBasic now using Spring Framework
package com.myjavalearning.spring_framework;


import com.myjavalearning.spring_framework.game.GameRunner;
import com.myjavalearning.spring_framework.game.IGamingConsole;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingBasicSpringBeans {
    public static void main(String[] args){

        try(
            AnnotationConfigApplicationContext context =
                    new AnnotationConfigApplicationContext(GamingBasicConfiguration.class)
        ){
            // Default game will be PacMan based on the usage of @Primary annotation
            context.getBean(GameRunner.class).run();

            System.out.println();

            // Dynamically switch to MarioGame bean
            IGamingConsole marioGame = context.getBean("marioGame", IGamingConsole.class);
            GameRunner marioGameRunner = new GameRunner(marioGame);
            marioGameRunner.run();

        }catch(BeansException ex){
            System.out.println(ex.getMessage());
        }

    }
}
