package org.common;

import org.springframework.stereotype.Component;

@Component
public class A implements Person{
    public void info(){
        System.out.println("calling from a");
    }
}
