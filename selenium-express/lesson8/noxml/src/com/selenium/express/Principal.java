package com.selenium.express;

import org.springframework.stereotype.Component;

@Component
public class Principal {

    public void principalInfo(){
        System.out.println("I am your principal");
        System.out.println("My name is James Bond.");
    }

}
