package com.selenium.express;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher{
    public void teach(){
        System.out.println("I am your math teacher");
    }
}
