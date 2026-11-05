package ecdmit.restdao.ext.internal;

import ecdmit.restdao.ext.EcdmLoginInfo;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import vmdmit.it.storages.VMwareBaseUtilService;

@Component("EcdmLoginInfoNonCompatibleImpl")
//@Data
public class EcdmLoginInfoNonCompatibleImpl implements EcdmLoginInfo {
//    @Value("${app.nonCompatible:non Compatible}")
    private String nonCompatible;
//    @Value("${app.nonCompatibleId:1234}")
    private int nonCompatibleId;
    VMwareBaseUtilService vMwareBaseUtilService;
//    @Inject
//    EcdmLoginInfoNonCompatibleImpl(String nonCompatible, int nonCompatibleId){
//        this.nonCompatible = nonCompatible;
//        this.  = nonCompatibleId;
//        System.out.println("create EcdmLoginInfoNonCompatible");
//    }
//    @Inject
    public EcdmLoginInfoNonCompatibleImpl(VMwareBaseUtilService vMwareBaseUtilService){
        this.vMwareBaseUtilService = vMwareBaseUtilService;
    }
    public void info(){
        System.out.println("bean non compatible: " + nonCompatible + " has id : " + nonCompatibleId);

    }
    @PostConstruct
    public void init(){
        info();
        vMwareBaseUtilService.info();
    }

}
