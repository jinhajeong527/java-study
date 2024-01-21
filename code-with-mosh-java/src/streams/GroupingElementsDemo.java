package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingElementsDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );
        Map<Genre, List<Movie>> result = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(result);

        Map<Genre, Set<Movie>> result2 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                                               Collectors.toSet()));
        System.out.println(result2);

        Map<Genre, Long> result3 = movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre,
                        Collectors.counting()));
        System.out.println(result3);

        Map<Genre, String> result4 = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(","))));
        System.out.println(result4);
    }
}
