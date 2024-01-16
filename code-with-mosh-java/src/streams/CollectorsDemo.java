package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void show() {
        List<Movie> movies = Arrays.asList(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );
        List<Movie> result = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toList());

        // key (title)
        // value (likes)
        Map<String, Integer> result2 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
        System.out.println(result2);

        Map<String, Movie> result3 = movies.stream()
                .filter(m -> m.getLikes() > 10)
                // m -> m 이라고 작성하는 대신에 Function.identity()를 사용할 수 있다.
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(result3);

        int number = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println(number);

        IntSummaryStatistics summary = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .collect(Collectors.summarizingInt(Movie::getLikes));
        System.out.println(summary);

        String joined = movies.stream()
                .filter(m -> m.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(joined);


    }
}
