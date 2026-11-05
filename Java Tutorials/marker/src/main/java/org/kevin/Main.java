package org.kevin;

public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        //Rectangle recNull;
        if(rec != null){
            System.out.println("rec instance is not null");
        }

        //System.out.println("value of recNull" + recNull);

        //if(recNull == null){
          //  System.out.println("recNull instance is null");
        //}
        System.out.println("Hello, World!");

        if(rec instanceof Shape){
            System.out.println("this is rectangle");
        }
    }
}