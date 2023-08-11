package Task3;
import java.util.*;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] str = {"1, 2, 0", "4, 5"};


        List<String> res = numberSorter(str);
        for (String result: res
             ) {
            System.out.println( result);
        }
    }

    public static List<String> numberSorter(String[] str) {
        return Collections.singletonList(Arrays.stream(str)
                .flatMap(s -> s
                        .chars()
                        .mapToObj(i -> (char) i))
                .filter(Character::isDigit)
                .sorted()
                .map(el -> "" + el)
                .collect(Collectors.joining(", ")));
    }
}
