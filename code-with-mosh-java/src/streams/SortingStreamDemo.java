package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingStreamDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30)
        );
        movies.stream()
//                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
//                .sorted(Comparator.comparing(m -> m.getTitle()))
                .sorted(Comparator.comparing(Movie::getTitle).reversed())
                .forEach(m -> System.out.println(m.getTitle()));
    }
}
