package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 3, 5);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);
        Stream<Integer> stream = zip(stream1, stream2);
        stream.forEach(s -> System.out.println(s));
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = new ArrayList<>(first.toList());
        List<T> secondList = new ArrayList<>(second.toList());
        List<T> resultList = new ArrayList<>();
        int resultLenght;
        if (firstList.size() > secondList.size()) {
            resultLenght = secondList.size();

        } else {
            resultLenght = firstList.size();
        }
        for (int i = 0; i < resultLenght; i++) {
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }
        return resultList.stream();
    }
}
