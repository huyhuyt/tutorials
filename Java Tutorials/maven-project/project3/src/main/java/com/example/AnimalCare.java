package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class AnimalCare {
    
    private Animal animal;
    
    

    AnimalCare( @Qualifier("dog") Animal animal){
        this.animal = animal;
    }

    public void makeSound(){
        animal.makeSound();
    }
}
