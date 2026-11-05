package org.kevin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class Student {
    @Value("${stu.ln:Kevin}")
    private String lastName;
    @Value(("${stu.fn:Kevin}"))
    private String firstName;
    private Sim sim;
    public void showInfo(){
        System.out.println(lastName + " " + firstName);
    }
    public void showUsage(){
        sim.call();
        sim.data();
    }
    @Autowired
    public Student(@Qualifier("tmobile")Sim sim){
        this.sim = sim;
    }
    public void simUsage(){
        sim.data();
        sim.call();
    }

    public Student(Sim sim, String lastName, String firstName){
        this.sim = sim;
        this.lastName = lastName;
        this.firstName = firstName;
    }

}
