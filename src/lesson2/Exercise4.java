package lesson2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Exercise4 {

    public static void main(String[] args) {

        Comparator<Person> hzChtoTutNapisano = new PersonNameComparator().thenComparing(new PersonAgeComparator().thenComparing(new PersonLastNameComparator()));
       Set<Person> people = new TreeSet<>(hzChtoTutNapisano);
        people.add(new Person(24, "Sania", "Paskar"));
        people.add(new Person(22, "Yana", "Hvozdetska"));
        people.add(new Person(25, "Nicolai", "Ionuta"));

        people.stream().map(p -> p.getAge() + " " + p.getName() + " " + p.getLastName()).forEach(System.out::println);
    }
}

class Person {

    private final int age;
    private final String name;
    private final String lastName;

    public Person(int a, String n, String m) {
        lastName = m;
        name = n;
        age = a;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getLastName() {
        return lastName;
    }
}

class PersonNameComparator implements Comparator<Person> {

    public int compare(Person a, Person b) {

        return a.getName().compareTo(b.getName());
    }
}

class PersonLastNameComparator implements Comparator<Person> {
    public int compare(Person a, Person b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}

class PersonAgeComparator implements Comparator<Person> {

    public int compare(Person a, Person b) {

        return Integer.compare(a.getAge(), b.getAge());
    }
}
