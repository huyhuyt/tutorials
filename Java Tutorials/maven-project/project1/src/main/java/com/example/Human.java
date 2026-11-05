package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;

@Component
public class Human {
    // @Autowired
    private Heart heart;

    @Inject
    public void setHeart(Heart heart){
        this.heart = heart;
    }
    
    public void startPumping() {
        if (heart != null) {

            heart.pump();
        } else {
            System.out.println("you are dead.");
        }
    }

}
