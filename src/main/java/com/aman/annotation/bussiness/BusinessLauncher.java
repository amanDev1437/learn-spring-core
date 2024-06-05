package com.aman.annotation.bussiness;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class BusinessClass{

    private DependencyClass dependency1;


//    public BusinessClass(DependencyClass dependency1){
//        System.out.println("Constructor injection");
//        this.dependency1 = dependency1;
//    }

    @Autowired
    public void setDependency1(DependencyClass dependency1){
        System.out.println("Setter injection");
        this.dependency1 = dependency1;
    }

    @Override
    public String toString() {
        return "BusinessClass{" +
                "dependency1=" + dependency1 +
                '}';
    }
}

@Component
class DependencyClass{

}

@Configuration
@ComponentScan
public class BusinessLauncher {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(BusinessLauncher.class);

        System.out.println(context.getBean(BusinessClass.class));



    }
}
