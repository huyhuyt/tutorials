package org.kevin;

public abstract class Duck {
    public abstract void swim();
    public void display(){
        System.out.println("I am duck");
    }
    public void fly(){
        System.out.println("I can fly");
    }
    public void quack(){
        System.out.println("I can make noise");
    }
}
