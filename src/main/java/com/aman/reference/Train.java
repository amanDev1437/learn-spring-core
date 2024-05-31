package com.aman.reference;

public class Train {

    private String name;
    private int speed;
    TrainDriver td;

    public Train(String name, int speed, TrainDriver td) {
        this.name = name;
        this.speed = speed;
        this.td = td;
    }

    public Train() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public TrainDriver getTd(){
        return td;
    }

    public void setTd(TrainDriver td){
        this.td = td;
    }
}
