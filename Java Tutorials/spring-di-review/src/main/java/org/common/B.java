package org.common;

import org.springframework.stereotype.Component;

@Component
public class B implements Person{
    public void info(){
        System.out.println("calling from b");
    }
}
