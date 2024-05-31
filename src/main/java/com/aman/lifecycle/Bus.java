package com.aman.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bus implements InitializingBean, DisposableBean {

    private double price;

    public Bus(){}

    public Bus(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Inside afterPropertiesSet method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
