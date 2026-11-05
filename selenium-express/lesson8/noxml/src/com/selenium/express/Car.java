package com.selenium.express;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public Car(){
        System.out.println("constructor Car ...");
    }
    public void carInfo(){
        System.out.println("Honda");
    }
}
