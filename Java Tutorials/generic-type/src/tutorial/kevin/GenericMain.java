package tutorial.kevin;

public class GenericMain {
    public static void main (String[] args){
        Cat mycat = new Cat();
        GenericClass<Cat> genericClass = new GenericClass<>();
        genericClass.makeSound(mycat);

        for(int i=0; i < 10; i++){
            System.out.println("line " + i);
            System.out.println("learn how to debug");
        }
    }
}
