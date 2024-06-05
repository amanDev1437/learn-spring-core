package com.aman.annotation.game;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class GameRunner {

    private GameConsole game;

    public GameRunner(GameConsole game){
        this.game = game;
    }

    public void run(){
        System.out.println("Running game:"+game);
        game.left();
        game.right();
        game.up();
        game.down();
    }
}
