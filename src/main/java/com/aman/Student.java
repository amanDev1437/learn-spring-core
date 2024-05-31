package com.aman;

public class Student {

    private int id;
    private String name;
    private String address;

    Student(){}

    Student(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    //getters
    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    //setters
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }


    public String toString(){

        return "Student{"+"id="+id+", name="+name+", address="+address+"}";
    }
}
