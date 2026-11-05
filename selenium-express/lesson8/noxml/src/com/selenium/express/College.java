package com.selenium.express;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("colBean")
public class College {

    @Value("${college.name}")
    private String collegeName;

    private Principal principal;
    
    @Autowired
    private Teacher teacher;
    
    public College(Principal principal){
        this.principal = principal;
    }
    
    @Autowired
    public void setPrincipal(Principal principal){
        this.principal = principal;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public void displayInfo(){
        System.out.println("infor on this college: ");
        principal.principalInfo();
        teacher.teach();
        System.out.println("my college name is " + collegeName);
    }

    /* public College(){
        System.out.println("constructor called ...");
    } */

    
}
