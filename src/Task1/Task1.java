package Task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            names.add(i + ". " + "name" + i);
        }
        List<String> sortedNames = namesSorter(names);
        System.out.println("sortedNames = " + sortedNames);
    }

    public static List<String> namesSorter(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(n -> n % 2 == 0)
                .mapToObj(names::get)
                .collect(Collectors.toList());
    }

}
