package com.example.course;

import javax.inject.Inject;



public class MathTeacher implements Teacher {
    //@Inject
    public Family f;
    public void teach(){
        System.out.println("I am your math teacher");
        f.showInfo();
    }
    public MathTeacher(Family f){
        this.f = f;
    }
}
