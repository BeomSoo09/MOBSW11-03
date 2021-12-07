package com.example.myapplication06;

import android.widget.EditText;

public class MemberInfo {

    private String name;
    private String phoneNumber;
    private String birthDay;
    private String address;
<<<<<<< HEAD
    private String height;
    private String weight;
    private String fever;
    private String medicine;

    public MemberInfo(String name,String phoneNumber,String birthDay,String address,String height,String weight,String fever, String medicine){
=======

    public MemberInfo(String name,String phoneNumber,String birthDay,String address){
>>>>>>> ac0aad1786204800e06b2c3a8446ffce83e8d66a
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.birthDay=birthDay;
        this.address=address;
<<<<<<< HEAD
        this.height=height;
        this.weight=weight;
        this.fever=fever;
        this.medicine=medicine;
=======
>>>>>>> ac0aad1786204800e06b2c3a8446ffce83e8d66a
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    public String getBirthDay(){
        return this.birthDay;
    }
    public void setBirthDay(String birthDay){
        this.birthDay=birthDay;
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address=address;
    }
<<<<<<< HEAD

    public String getHeight(){
        return this.height;
    }
    public void setHeight(String height){
        this.height=height;
    }

    public String getWeight(){
        return this.weight;
    }
    public void setWeight(String weight){
        this.weight=weight;
    }

    public String getFever(){
        return this.fever;
    }
    public void setFever(String fever){
        this.fever=fever;
    }

    public String getMedicine(){
        return this.medicine;
    }
    public void setMedicine(String medicine){
        this.medicine=medicine;
    }
=======
>>>>>>> ac0aad1786204800e06b2c3a8446ffce83e8d66a
}
