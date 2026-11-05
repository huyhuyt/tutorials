package com.example;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animal{
    public void makeSound(){
        System.out.println("grrrr.....");
    }
    
}
