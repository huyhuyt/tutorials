package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal{

    public void makeSound(){
        System.out.println("Gow Gow...");
    }
    
}
