package Task3;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(50));
        }
        System.out.println("numbers = " + numbers);
        List<String > res = numberSorter(numbers);
        System.out.println(res);

    }
    public static List<String> numberSorter(List<Integer> numbers){
        return numbers.stream()
                .sorted()
                .map(n->n + "")
                .collect(Collectors.toList());
    }
}
