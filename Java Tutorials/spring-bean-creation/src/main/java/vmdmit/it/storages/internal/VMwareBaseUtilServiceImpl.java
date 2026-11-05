package vmdmit.it.storages.internal;

import ecdmit.restdao.ext.EcdmLoginInfo;
import ecdmit.restdao.ext.internal.EcdmLoginInfoImpl;
import jakarta.annotation.PostConstruct;
import jakarta.inject.Inject;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import vmdmit.it.storages.VMwareBaseUtilService;

@Component
@PropertySource("classpath:application.properties")
@Data
public class VMwareBaseUtilServiceImpl implements VMwareBaseUtilService {
    @Value("${app.name:kevin}")
    private String name;
    @Value("${app.id:123}")
    private int id;
    EcdmLoginInfo ecdmLoginInfo;
//    public VMwareBaseUtilServiceImpl(){
//
//        System.out.println("create bean VMwareBaseServiceUtilImpl ") ;
//    }

//    public VMwareBaseUtilServiceImpl(String name, int id){
//        System.out.println("execute here");
//        this.name = name;
//        this.id = id;
//    }
    @Inject
    VMwareBaseUtilServiceImpl(EcdmLoginInfo ecdmLoginInfo){
        this.ecdmLoginInfo = ecdmLoginInfo;
    }
    @PostConstruct
    public void init(){

        System.out.println("bean name: " + name + " and id: " + id);
        ecdmLoginInfo.info();
    }
    public void info(){
        System.out.println("info bean VMwareBaseUtilService");
    }
}
