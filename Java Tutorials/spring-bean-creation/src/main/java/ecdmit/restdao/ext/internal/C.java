package ecdmit.restdao.ext.internal;

import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import org.springframework.stereotype.Component;

@Component
public class C
{
    private final A a;
    private final B b;

    @Inject
    public C(A a, B b){
        this.a = a;
        this.b = b;
    }

    public void info(){
        a.info();
        b.info();
    }
    @PostConstruct
    public void init(){
        info();
    }
}
