package lesson2;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
       Stream.of("12", "123", null, "12345", "123456")
                .filter(Objects::nonNull)
                .collect(Collectors.toMap(String::length, a -> a, (a, b) -> a + b))
                .entrySet()
                .forEach(System.out::println);


    }
}
