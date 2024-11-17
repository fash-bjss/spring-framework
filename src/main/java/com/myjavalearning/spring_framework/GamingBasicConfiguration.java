package com.myjavalearning.spring_framework;

import com.myjavalearning.spring_framework.game.IGamingConsole;
import com.myjavalearning.spring_framework.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingBasicConfiguration {

    @Bean
    public IGamingConsole game(){
        return new PacManGame();
    }
}
