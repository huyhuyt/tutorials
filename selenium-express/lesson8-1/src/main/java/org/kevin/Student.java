package org.kevin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Student {
//    private String lastName;
//    private String firstName;
//    @Autowired
//    @Inject
    @Value("${stu.ln:Nguyen}")
    private  String lastName;
    @Value("${stu.fn:Kevin}")
    private  String firstName;
/*    public Student(

    @Value("${stu.ln:Nguyen}")
            String lastName,
    @Value("${stu.fn:Kevin}")
            String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }*/
    public void showInfo(){
        System.out.printf(lastName + " " + firstName);
    }
}
