package lesson2;

import java.util.HashSet;
import java.util.Objects;

public class Exercise3 {
    public static void main(String[] args) {

        Persons person = new Persons(24, "Sania", "Paskar");
        Persons person1 = new Persons(22, "Yana", "Ionuta");
        Persons person2 = new Persons(25, "Nicolai", "Ionuta");
        if ((Objects.equals(person.lastName, person1.lastName))) {
            person.equals(person1);
        }
        if (Objects.equals(person1.lastName, person2.lastName)) {
            person1.equals(person2);
        }
        if (Objects.equals(person2.lastName, person.lastName)) {
            person2.equals(person);
        }
        final var strings = new HashSet<String>();
        strings.add(person.lastName);
        strings.add(person1.lastName);
        strings.add(person2.lastName);
        strings.forEach(System.out::println);
    }
}
class Persons {
    int age;
    String name;
    String lastName;
    public Persons(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }
}


