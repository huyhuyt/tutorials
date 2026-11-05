package ecdmit.restdao.ext.internal;

import ecdmit.restdao.ext.EcdmLoginInfo;
import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class EcdmLoginInfoImpl implements EcdmLoginInfo {
    public EcdmLoginInfoImpl(){
        System.out.println("create EcdmLoginInfoImpl bean");
    }
    public void info(){
        System.out.println("check if bean dependency created and injected");
    }
}
