package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BaseConfig.class);
        Human human = ctx.getBean("human", Human.class);
        
        human.startPumping();
    }
}
