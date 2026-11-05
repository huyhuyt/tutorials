package org.common;

import org.springframework.stereotype.Component;

@Component
public class C implements Person{
    private A a;
    private B b;
//    @Inject
//    public C(A a, B b){
//        this.a = a;
//        this.b = b;
//    }
    public void info(){
        a.info();
        b.info();
        System.out.println("calling from c");
    }
//    public C(){
//
//    }
}
