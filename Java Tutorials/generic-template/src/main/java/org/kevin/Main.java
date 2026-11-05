package org.kevin;

public class Main {
    public static void main(String[] args) {
        PrintThing<Integer> a = new PrintThing<>(5);
        PrintThing<String> s = new PrintThing<>("Kevin");
        PrintThing<Double> d = new PrintThing<>(5.343);

        a.printAny();
        s.printAny();
        d.printAny();
    }
}