package com.aman.reference;

public class TrainDriver {

    private String driverName;
    private int driverAge;

    public TrainDriver(){}

    public TrainDriver(String driverName, int driverAge){
        this.driverName = driverName;
        this.driverAge = driverAge;
    }

    public String getDriverName(){
        return driverName;
    }

    public int getDriverAge() {
        return driverAge;
    }

    public void setDriverName(String driverName){
        this.driverName = driverName;
    }

    public void setDriverAge(int driverAge){
        this.driverAge = driverAge;
    }
}
