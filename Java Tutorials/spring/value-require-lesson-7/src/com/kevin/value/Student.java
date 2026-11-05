package com.kevin.value;

import lombok.Setter;

@Setter
public class Student {
    private String name;
    private String interestedCourse;
    private String hobby;
/* 
    public void setName(String name){
        this.name = name;
    }
    public void setInterestedCourse(String interestedCourse){
        this.interestedCourse = interestedCourse;
    }
    */
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
    public void displayStudentInfo(){
        System.out.println("student name is : " + name + " having interested course " + interestedCourse + " and hobby " + hobby);
    }


}
