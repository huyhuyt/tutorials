package com.kevin;

import java.util.ArrayList;
import java.util.List;

public class CompareList {
    public static void main(String[] args){
        List<String> a = new ArrayList<>();
        a.add("crypto");
        a.add("virtual");
        a.add("disk");
        a.add("memory");
        a.add("cpu");

        List<String> b = new ArrayList<>();
        b.add("cpu");
        b.add("memory");

        List<String> miss = new ArrayList<>();

        for (String s : a){
            if(!b.contains(s)){
                miss.add(s);
            }
        }

        /* for(String s:miss){
            System.out.println("missing privilege : " + s);
        } */

        miss.forEach((entry)->{System.out.println("missing privilege: " + entry);});

        

    }
}
