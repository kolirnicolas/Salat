package Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {
        final var people = new ArrayList<String>();
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add("Bob");
        people.add("Sania");
        people.add("Yana");
        people.add("Nicolas");
        people.add("Fuker");
        people.add("Mishka");
        people.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
