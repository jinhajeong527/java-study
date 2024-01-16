package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReducerDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );
        long count = movies.stream()
                .count();
        System.out.println(count);

        boolean result = movies.stream()
                .anyMatch(m -> m.getLikes() > 20);
        System.out.println(result);

        boolean result2 = movies.stream()
                .allMatch(m -> m.getLikes() > 20);
        System.out.println(result2);

        boolean result3 = movies.stream()
                .noneMatch(m -> m.getLikes() > 20);
        System.out.println(result3);

        // for preventing npe
        Optional<Movie> op = movies.stream()
                            .findFirst();
        Movie movie = op.get();
        System.out.println(movie.getTitle());

        Movie result4 = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(result4.getTitle());

        // [10, 20, 30]
        // [30, 30]
        // [60]
        Optional<Integer> sum = movies.stream()
                .map(m -> m.getLikes())
                .reduce(Integer::sum); // Method Reference

        int value = sum.orElse(0);
        System.out.println(value);

        // 초기값 제공하면, Optional 객체 다룰필요가 없어진다.
        Integer sum2 = movies.stream()
                .map(m -> m.getLikes())
                .reduce(0, Integer::sum); // Method Reference
        System.out.println(sum2);


    }
}
