package org.alice;

import jakarta.annotation.PostConstruct;
import org.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("alice")
public class AliceImpl implements Employee {
    @Value("${app.lastName:Nguyen}")
    private String lastName;
    @Value("${app.firstName:Alice}")
    private String firstName;
    @Value("${app.age:16}")
    private int age;
    public void info(){
        System.out.println(toString());
    }
    public String toString(){
        return "Employee has last name " + lastName + " first name: " + firstName + " age is : " + age;
    }
    @PostConstruct
    public void init(){
        info();
    }
}
