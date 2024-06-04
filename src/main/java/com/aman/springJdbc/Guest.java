package com.aman.springJdbc;

public class Guest {

    private int guestId;
    private String guestName;
    private String contact;


    public Guest(){}

    public Guest(int guestId,String guestName, String contact){
        this.guestId = guestId;
        this.guestName = guestName;
        this.contact = contact;
    }

    public String getGuestName(){
        return guestName;
    }

    public String getContact(){
        return contact;
    }

    public int getGuestId(){
        return guestId;
    }

    public void setGuestId(int guestId){
        this.guestId = guestId;
    }

    public void setGuestName(String guestName){
        this.guestName = guestName;
    }

    public void setContact(String contact){
        this.contact = contact;
    }

}
