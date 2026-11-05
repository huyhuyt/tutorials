package com.example;

import org.springframework.stereotype.Component;

@Component
public class Vodaphone implements Sim{
    public void calling(){
        System.out.println("Calling use Vodaphone");

    }

    public void data(){
        System.out.println("browse internet use Vodaphone");
    }
    
}
