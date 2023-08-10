package Task2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String > names  = new ArrayList<>(Arrays.asList("Igor","Myron","Zahar","Anastasia","Myron"));

        List<String> res = listSorter(names);
        System.out.println("res = " + res);

    }
    public static List<String> listSorter(List<String> names){
        return names.stream()
                .peek(n-> n.toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }
}
