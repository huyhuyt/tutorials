package com.kevin;

public class Car {
    private String name;
    private int age;
    /* Car(){
        this.age = 10;
        this.name = "Toyota";
    } */

    public Car(String name, int age){
        this.name = name;
        this.age = age;
    }
    String getMyCarName(){
        return name;

    }
    int getMyCarAge(){
        return age;
    }
}
