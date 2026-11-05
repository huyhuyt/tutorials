package org.kevin;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);
        Optional<String> otherName = Optional.ofNullable("test");
        Optional<String> emptyName = Optional.empty();

        System.out.println("Hello, World!");
        System.out.println(name.orElse("java"));
        System.out.println(otherName.get());

        if(emptyName.isEmpty()){
            System.out.println("String is empty");
        }

        StringBuilder sbd = new StringBuilder();
        sbd.append("test string builder: ");
        System.out.println(sbd);

        StringBuffer sbf = new StringBuffer();
        sbf.append("test string buffer");
        System.out.println(sbf);


        Thread t1  = new Thread(()->{
            for(int i=0; i < 100; i++){
                sbf.append("A");
                System.out.println("running thread 1:");
                System.out.println(sbf);
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=0; i < 100; i++){
                sbf.append("B");
                System.out.println("running thread 2:");
                System.out.println(sbf);
            }
        });

        t1.start();
        t2.start();


    }
}