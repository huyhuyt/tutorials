package com.kevin.springioc;

public class Vodaphone implements Sim {
    public Vodaphone(){
        System.out.println("vodaphone object contructured");
    }
    @Override
    public void calling(){
        System.out.println("calling use Vodaphone sim");
    }
    @Override
    public void data(){
        System.out.println("browsing internet use Vodaphone");
    }
}
