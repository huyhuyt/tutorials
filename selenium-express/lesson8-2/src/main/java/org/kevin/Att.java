package org.kevin;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("att)")
public class Att implements Sim{
    @Override
    public void data() {
        System.out.println("data from ATT");
    }

    @Override
    public void call() {
        System.out.println("calling from ATT");

    }
}
