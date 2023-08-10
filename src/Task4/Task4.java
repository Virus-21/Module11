package Task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        RandomAlg randomAlg = new RandomAlg();
        Stream<Integer> integerStream = Stream.iterate(11, (seed) -> randomAlg.withSeed(seed).next());
        integerStream
                .peek(System.out::println)
                //.limit(100)
                .collect(Collectors.toList());
    }
}
