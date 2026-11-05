package org.kevin;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("tmobile")
public class TmobileImpl implements Sim {
    @Override
    public void data() {
        System.out.println("data from Tmobile");
    }

    @Override
    public void call() {
        System.out.println("calling from Tmobile");
    }
}
