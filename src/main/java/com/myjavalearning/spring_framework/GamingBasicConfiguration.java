package com.myjavalearning.spring_framework;

import com.myjavalearning.spring_framework.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingBasicConfiguration {

    @Bean
    @Primary
    public IGamingConsole pacManGame(){
        return new PacManGame();
    }

    @Bean
    @Qualifier()
    public IGamingConsole marioGame(){
        return new MarioGame();
    }

    @Bean
    public IGamingConsole superContraGame(){
        return new SuperContraGame();
    }

    @Bean
    public GameRunner gameRunner(IGamingConsole game){
        return new GameRunner(game);
    }

    // This game runner is using the @Qualifier to inject a specific game based on user choice.
//    @Bean
//    public GameRunner gameRunner(@Qualifier("marioGame") IGamingConsole game){
//        return new GameRunner(game);
//    }
}
