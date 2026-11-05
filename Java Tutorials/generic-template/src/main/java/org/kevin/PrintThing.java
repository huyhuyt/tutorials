package org.kevin;

public class PrintThing <T>{
    private T thingToPrint;
    public void printAny(){
        System.out.println(thingToPrint);
    }
    public PrintThing(T a){
        this.thingToPrint = a;
    }
}
