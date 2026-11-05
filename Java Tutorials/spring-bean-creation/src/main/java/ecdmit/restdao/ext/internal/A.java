package ecdmit.restdao.ext.internal;

import ecdmit.restdao.ext.EcdmLoginInfo;
import org.springframework.stereotype.Component;

@Component
public class A implements EcdmLoginInfo {
    public void info(){
        System.out.println("calling info from A class");
    }
}
