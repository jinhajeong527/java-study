package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));

        Stream.of(1, 2, 3, 4);
        // infinite stream of random number
        Stream stream = Stream.generate(() -> Math.random());
        stream.limit(3)
                // operation that terminates that stream
                .forEach(n -> System.out.println(n));

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));

    }
}
