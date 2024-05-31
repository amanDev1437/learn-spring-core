package com.aman.lifecycle;

public class Car {

    private double price;

    public Car(){}

    public Car(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }


    public void init(){
        System.out.println("Inside init method");
    }


    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
