package com.selenium.express;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Family {
    @Value("${family.name}")
    String familyName;
    @Value("${family.person}")
    int numOfperson;

    private  Car car;
    private  Job job;

    public void test(){
        System.out.println("Familly name " + familyName + " has " + numOfperson + " person;");  
        car.carInfo();
        job.jobInfo();      
    }

    @Autowired
    public Family(Car car, Job job){
        this.car = car;
        this.job = job;
    }

    //@Autowired
    public Family(Car car){
        this.car = car;

    }

    /* 
    @Autowired
    public void setJob(Job job){
        this.job = job;
    }
    @Autowired
    public void setCar(Car car){
        this.car = car;
    } */
}
