package Task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Igor", "Myron", "Zahar", "Anastasia", "Myron", "Danya", "ivan", "Makar"));
        List<String> sortedNames = namesSorter(names);
        System.out.println(sortedNames);
    }

    public static List<String> namesSorter(List<String> names) {
        return IntStream.range(1, names.size())
                .filter(n -> n % 2 != 0)
                .mapToObj(names::get)
                .map(h -> names.indexOf(h) + ". " + h)
                .collect(Collectors.toList());
    }

}
