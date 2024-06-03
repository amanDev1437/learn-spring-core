package com.aman.stereotypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("stereoTypeConfig.xml");

        Car car = context.getBean("car", Car.class);
        Car car1 = context.getBean("car", Car.class);

//        System.out.println(car.getName());
//        System.out.println(car.getHp());
//        System.out.println(car.color());
//        System.out.println(car.getShowRoomCity());

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());

    }
}
