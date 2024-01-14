package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );
        // Imperative Programming
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getLikes() > 10)
                count++;
        }
        // Declarative (Functional) Programming
        long count2 = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
        System.out.println(count2);

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));

        movies.stream()
                .mapToInt(movie -> movie.getLikes())
                .forEach(likes -> System.out.println(likes));

        // Stream<List<x>> -> Stream<x> : flatten
        Stream<List<Integer>> stream =
                Stream.of(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6));
        stream
                .flatMap(list -> list.stream())
                .forEach(n -> System.out.println(n));
        // 이런 리스트를 flatten 하고 싶을 수 있다.
        // .flatMap(list -> list.stream()) 이렇게 추가하면
        // forEach에 넘어가는 것은 리스트가 아니라 Integer가 된다.

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(m -> System.out.println(m));

    }
}
