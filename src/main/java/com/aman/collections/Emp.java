package com.aman.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {

    private String empName;
    private int empId;
    private List<String> phones;
    private Set<String> addresses;
    private Map<String, String> courses;

    public Emp(){}

    public Emp(String empName,int empId, List<String> phones, Set<String> addresses, Map<String, String> courses){
        this.empName = empName;
        this.empId = empId;
        this.phones = phones;
        this.addresses = addresses;
        this.courses = courses;
    }

    public String getEmpName(){
        return empName;
    }
    public int getEmpId(){
        return empId;
    }

    public List<String> getPhones(){
        return phones;
    }

    public Set<String> getAddresses(){
        return addresses;
    }

    public Map<String, String> getCourses(){
        return courses;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public void setPhones(List<String> phones){
        this.phones = phones;
    }

    public void setAddresses(Set<String> addresses){
        this.addresses = addresses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }
}
