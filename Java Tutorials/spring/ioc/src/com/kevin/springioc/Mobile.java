package com.kevin.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        /* Sim sim = ctx.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
        Me me = new Me();
        me.name  = "Kevin Nguyen"; */

        Student kevin = ctx.getBean("student", Student.class);
        kevin.displayStudent();

        
    }
}
