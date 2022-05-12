package lesson2;

import java.util.HashSet;
import java.util.Objects;

public class Exercise3 {
    public static void main(String[] args) {

        PersonExercise3 person = new PersonExercise3(24, "Sania", "Paskar");
        PersonExercise3 person1 = new PersonExercise3(22, "Yana", "Ionuta");
        PersonExercise3 person2 = new PersonExercise3(25, "Nicolai", "Ionuta");

        final var strings = new HashSet<PersonExercise3>();
        strings.add(person);
        strings.add(person1);
        strings.add(person2);
        strings.forEach(System.out::println);
    }
}

class PersonExercise3 {
    private final int age;
    private final String name;
    private final String lastName;

    public PersonExercise3(int age, String name, String lastName) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonExercise3 that = (PersonExercise3) o;
        return lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return "PersonExercise3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
}


