package org.kim.albert;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import org.Employee;
import org.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kim extends Person {
    @Value("${app.kim.firstname:Kim}")
    String firstName;

//    @Autowired
    Albert albert;
    Employee alice;
    public void info(){
        System.out.println("Employee firstname: " + firstName + " has son ");
        albert.info();
        alice.info();
    }
    @Inject
    public Kim(Albert albert, Employee alice){
        this.albert = albert;
        this.alice = alice;
    }
    public Kim(String firstName){
        this.firstName = firstName;
    }
//    @Inject
//    public Kim(Employee alice){
//        this.alice = alice;
//    }

    @PostConstruct
    public void init(){
        info();
    }
}
