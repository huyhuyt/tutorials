package com.kevin.springioc;

public class Airtel implements Sim {
    public Airtel(){
        System.out.println("airtel object constructed");
    }
    @Override
    public void calling(){
        System.out.println("calling use Airtel");
    }
    @Override
    public void data(){
        System.out.println("browsing internet use Airtel");
    }

}
