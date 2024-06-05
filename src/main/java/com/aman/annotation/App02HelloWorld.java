package com.aman.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.aman.annotation.HelloWorld")
public class App02HelloWorld {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorld.class);

        var bean = context.getBean(HelloWorld.class);

        System.out.println(bean.getName());
        System.out.println(bean.getAge());

    }

}
