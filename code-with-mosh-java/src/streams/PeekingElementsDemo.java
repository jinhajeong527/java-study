package streams;

import java.util.Arrays;
import java.util.List;

public class PeekingElementsDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println("mapped: " + t))
                .forEach(System.out::println);
    }
}
