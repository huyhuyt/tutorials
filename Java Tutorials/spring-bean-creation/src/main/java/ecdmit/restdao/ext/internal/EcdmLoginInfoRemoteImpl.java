package ecdmit.restdao.ext.internal;

import ecdmit.restdao.ext.EcdmLoginInfo;
import org.springframework.stereotype.Component;

@Component
public class EcdmLoginInfoRemoteImpl implements EcdmLoginInfo {
    EcdmLoginInfoRemoteImpl(){
        System.out.println("creat bean EcdmLoginInfoRemoteImpl");
    }
    public void info(){

    }
}
