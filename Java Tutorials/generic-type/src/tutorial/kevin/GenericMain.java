package tutorial.kevin;

public class GenericMain {
    public static void main (String[] args){
        Cat mycat = new Cat();
        GenericClass<Cat> genericClass = new GenericClass<>();
        genericClass.makeSound(mycat);
    }
}
