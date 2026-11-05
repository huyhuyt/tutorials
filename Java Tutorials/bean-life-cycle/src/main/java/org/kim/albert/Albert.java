package org.kim.albert;

import jakarta.annotation.PostConstruct;
import org.Employee;
import org.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Albert extends Person {
    @Value("${app.albert.lastname:Nguyen}")
    String lastName;
    @Value("${app.alice.firstName:Albert}")
    String firstName;
    @Value("${app.albert.age:14}")
    int age;
    public void info(){
        System.out.println("employ first name :" + firstName + " last name: " + lastName + " age: " + age);
    }
    @PostConstruct
    public void init(){
        info();
    }
}
