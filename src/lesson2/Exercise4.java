package lesson2;

import java.util.Comparator;
import java.util.TreeSet;

public class Exercise4 {
    public static void main(String[] args) {
        Comparator<Person> hzChtoTutNapisano = new PersonNameComparator().thenComparing(new PersonAgeComparator().thenComparing(new PersonLastNameComparator()));
        TreeSet<Person> people = new TreeSet(hzChtoTutNapisano);
        people.add(new Person(24, "Sania", "Paskar"));
        people.add(new Person(22, "Yana", "Hvozdetska"));
        people.add(new Person(25, "Nicolai", "Ionuta"));

        for (Person p : people) {

            System.out.println(p.getAge() + " " + p.getName() + " " + p.getLastName());
        }
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

        if (a.getAge() > b.getAge())
            return 1;
        else if (a.getAge() < b.getAge())
            return -1;
        else
            return 0;
    }
}
