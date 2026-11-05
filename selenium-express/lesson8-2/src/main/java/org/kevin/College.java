package org.kevin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.security.Principal;
@Component
public class College {
    private Student student;
    private Professor professor;
//    @Inject
    @Autowired
    public College(Student student){
        this.student = student;
    }
//    @Autowired
    public College(Professor professor, Student student){
        this.professor = professor;
        this.student = student;
    }

    public void showInfo(){
        student.showInfo();
        student.simUsage();
    }
}
