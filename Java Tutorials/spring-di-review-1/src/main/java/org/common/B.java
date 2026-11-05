package org.common;

import org.kevin.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class B implements Person{
    public void info(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("calling from B");
    }
}
