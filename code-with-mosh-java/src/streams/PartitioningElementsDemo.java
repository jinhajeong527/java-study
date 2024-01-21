package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitioningElementsDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );

        Map<Boolean, List<Movie>> result1 = movies.stream()
                .collect(Collectors.partitioningBy(m -> m.getLikes() > 20));
        System.out.println(result1);

        Map<Boolean, String> result2 = movies.stream()
                .collect(Collectors.partitioningBy(
                        m -> m.getLikes() > 20,
                        Collectors.mapping(Movie::getTitle,
                                Collectors.joining(","))));
        System.out.println(result2);

    }
}
