package com.myjavalearning.spring_framework;

import com.myjavalearning.spring_framework.game.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingBasicConfiguration {

    @Bean
    public IGamingConsole pacManGame(){
        return new PacManGame();
    }

    @Bean
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
}
