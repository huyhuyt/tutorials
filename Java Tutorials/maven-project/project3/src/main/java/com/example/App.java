package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /* System.out.println( "Hello World!" );
        Animal cat = new Cat();
        cat.makeSound();

        AnimalCare animalCare = new AnimalCare(new Cat());
        animalCare.makeSound();
 */
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
        AnimalCare animalCare2 = ctx.getBean("animalCare", AnimalCare.class);
        animalCare2.makeSound();
        ctx.close();
    }
}
