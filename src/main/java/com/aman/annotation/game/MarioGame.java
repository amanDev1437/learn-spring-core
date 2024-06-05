package com.aman.annotation.game;

import org.springframework.stereotype.Component;


@Component
public class MarioGame implements GameConsole {

    public void left(){
        System.out.println("Move left");
    }

    public void right(){
        System.out.println("Move right");
    }

    public void up(){
        System.out.println("Jump");
    }

    public void down(){
        System.out.println("Sit down");
    }
}
