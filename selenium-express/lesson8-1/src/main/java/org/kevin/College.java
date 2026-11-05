package org.kevin;

import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class College {
    private Student student;
    public void showStudent(Student student){
        System.out.println("Information on this student ");
        student.showInfo();
    }
    @Inject
    public College(Student student){
        this.student = student;
    }
}
