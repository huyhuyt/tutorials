package com.example;

import org.springframework.stereotype.Component;

@Component
public class Heart {

    public void pump(){
        System.out.println("heart is pumping.");
        System.out.println("you are alive");
    }

    public Heart(){
        System.out.println("default constructor Heart called");
    }

}
