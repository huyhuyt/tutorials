package com.kevin.loosecoupling;

public class Human {
    private Heart heart;
    public void setHeart(Heart h){
        this.heart = h;
    }
    public void startPumping(){
        if(heart != null){
            heart.pump();
        } else {
            System.out.println("you are dead");
        }
    }
}
