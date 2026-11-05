import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> names = Arrays.asList("alice", "Albert","Kevin","kim","Yen","quan");
        // names.stream()
        //     .filter(name -> !name.equals("quan"))
        //     .forEach(name -> System.out.println(name));


        List<Person> people = getPeople();
        List<Person> females = people.stream()
            .filter(person -> person.getGender().equals(Gender.FEMALE))
            .collect(Collectors.toList());
        //females.forEach(System.out::println);
        // people.stream().filter(person -> person.getGender() == Gender.FEMALE)
        //     .forEach(person -> System.out.println(person.getName()));

        List<Person> sorted = people.stream()
            .sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender))
            .collect(Collectors.toList());

        // sorted.forEach(System.out::println);

        Cat cat = new Cat();
        cat.print();

        printThing(cat);
    }

    static void printThing(Printable t){
        t.print();
    }
    private static List<Person> getPeople(){
    return List.of(
        new Person("Kim",50, Gender.FEMALE),
        new Person("kevin",50,Gender.MALE),
        new Person("albert", 12, Gender.MALE),
        new Person("alice",14,Gender.FEMALE),
        new Person("yen",20,Gender.FEMALE)

    );
    }
}
