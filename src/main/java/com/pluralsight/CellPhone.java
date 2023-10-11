package com.pluralsight;

public class CellPhone {
    private int serial;
    private String model;
    private String carrier;
    private String  phoneNumber;
    private String name;

    public CellPhone(){
        this.serial = serial;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }
    public int getSerial(){
        return this.serial;
    }
    public void setSerial(int serial){
        this.serial = serial;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getCarrier(){
        return this.carrier;
    }
    public void setCarrier(String carrier){
        this.carrier = carrier;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
