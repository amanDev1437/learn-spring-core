package com.aman.annotation.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.aman.annotation.game")
public class GameLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(GameLauncher.class);

        context.getBean(GameRunner.class).run();
    }
}
