package com.aman.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;


public class TestStudent {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);

        Student student = context.getBean("student", Student.class);


        System.out.println("Enter the Name of Student");
        Scanner sc = new Scanner(System.in);

        String name = sc.next();

        System.out.println("Enter the age of Student");
        int age = sc.nextInt();

        student.setName(name);
        student.setAge(age);

        System.out.println("Enter the state");
        String state = sc.next();
        student.getAdd().setState(state);

        System.out.println("Enter the city");
        String city = sc.next();
        student.getAdd().setCity(city);

        System.out.println("Entered Student Details");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAdd().getState());
        System.out.println(student.getAdd().getCity());



    }



}
