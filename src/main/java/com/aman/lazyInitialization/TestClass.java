package com.aman.lazyInitialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("Some more initialization");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }

}
@Configuration
@ComponentScan
public class TestClass {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(TestClass.class);

        System.out.println("After context");
        context.getBean(ClassB.class).doSomething();
    }
}
