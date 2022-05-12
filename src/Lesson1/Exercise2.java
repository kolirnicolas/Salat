package Lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Exercise2 {
    public static void main(String[] args) {
      List<Long> number = new ArrayList<>();
        number.add(1L);
        number.add(2L);
        number.add(3L);
        number.add(1L);
        number.add(2L);
        Stream<Long> stream = number.stream();
        stream.distinct().forEach(System.out::println);
    }
}

