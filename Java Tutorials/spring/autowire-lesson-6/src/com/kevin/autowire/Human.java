package com.kevin.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
    private Heart heart;
    public void setHeart(Heart h){
        this.heart = h;
    }
    @Autowired
    public Human(Heart h){
        this.heart = h;
    }
    public Human(){
        
    }
    public void startPumping(){
        if(heart != null){
            heart.pump();
        } else {
            System.out.println("you are dead");
        }
    }
}
