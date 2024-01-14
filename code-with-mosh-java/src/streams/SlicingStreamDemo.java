package streams;

import java.util.Arrays;
import java.util.List;

public class SlicingStreamDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10),
                new Movie("b", 35),
                new Movie("c", 20)
        );
        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getTitle()));

        movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getTitle()));

        // 1000 movies
        // 10 movies per page
        // 3rd page
        // skip(20) = skip( (page-1) * pageSize )
        // limit(10) = limit(pageSize)
//        movies.stream()
//                .skip(20)
//                .limit(10)
//                .forEach(m -> System.out.println(m.getTitle()));

        movies.stream()
                .takeWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle())); // a

        movies.stream()
                .dropWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle())); // b, c


    }
}
