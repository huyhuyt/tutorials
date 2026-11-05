package org.common;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class C {
    private final A a;
    private final B b;


    public C(A a, B b){
        this.a = a;
        this.b = b;
    }

    @PostConstruct
    public void init(){
        a.info();
        b.info();
    }
}
