package ecdmit.restdao.ext.internal;

import ecdmit.restdao.ext.EcdmLoginInfo;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class B implements EcdmLoginInfo {
//    @Inject
    @Value("${app.nameB:B}")
    String name;
    int id;
    private final A a;
    public void info(){
        System.out.println("calling info from " + name + " class");
        a.info();
    }
//    public B(){}
    public B(A a){
        this.a = a;
    }
//    public B(int id){
//        this.id = id;
//    }
//    @Inject
//    public B(A a, String name){
//        this.a = a;
//        this.name = name;
//    }
//    public B(String name){
//        this.name = name;
//    }
    @PostConstruct
    public void init(){
        info();
    }
}
