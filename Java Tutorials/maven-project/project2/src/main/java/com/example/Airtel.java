package com.example;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements Sim{
    public void calling(){
        System.out.println("calling use Airtel");
    }

    public void data(){
        System.out.println("use Airtel data");
    }
    
}
