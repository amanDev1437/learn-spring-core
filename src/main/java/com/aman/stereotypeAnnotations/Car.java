package com.aman.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Car {

    @Value("Tata")
    private String name;

    @Value("9")
    private int hp;

    @Value("Red")
    private String color;

    @Value("#{showRoomCity}")
    private List<String> showRoomCity;

    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    public String color(){
        return color;
    }

    public List<String> getShowRoomCity(){
        return showRoomCity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setShowRoomCity(List<String> showRoomCity){
        this.showRoomCity = showRoomCity;
    }

}
