package lesson2;

import java.util.stream.Stream;

public class Exercise1 {
    public static void main(String[] args) {

        Stream.of("Amazon", "Cce", "Dde", "IeZ", "Fweew", "heZ")
                .filter(s -> s.startsWith("A") || s.endsWith("Z"))
                .forEach(System.out::println);
    }
}

