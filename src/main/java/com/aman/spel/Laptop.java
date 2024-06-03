package com.aman.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

    static int year = 2004;

    @Value("Dell")
    private String name;

    @Value("Windows")
    private String os;

    @Value("#{T(Math).sqrt(4)}")
    private int versions;

    public String getName(){
        return name;
    }

    public String getOs(){
        return os;
    }

    public int getVersions(){
        return versions;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOs(String os){
        this.os = os;
    }

    public void setVersions(int versions){
        this.versions = versions;
    }
}
