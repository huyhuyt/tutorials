package com.selenium.express;

import org.springframework.stereotype.Component;

@Component
public class Job {
    public Job(){
        System.out.println("constructor job ...");
    }
    public void jobInfo(){
        System.out.println("programming");
    }

}
