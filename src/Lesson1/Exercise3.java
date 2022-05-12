package Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
