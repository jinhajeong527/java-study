package streams;

import java.util.stream.IntStream;

public class PrimitiveTypeStreamDemo {
    public static void show() {
        // Upper bound inclusive
        IntStream.rangeClosed(1, 5)
                .forEach(System.out::println);
        // Upper bound exclusive
        IntStream.range(1, 5)
                .forEach(System.out::println);
    }
}
