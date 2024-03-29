package lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
    public static void show() {
        Function<String, Integer> map = str -> str.length();
        int length = map.apply("Sky");
        System.out.println(length);

        BiFunction<String, Integer, String> order = (product, count) -> {
            return "You just ordered " + count + " " + product + "(s)";
        };
        String message = order.apply("Coffee Bean", 3);
        System.out.println(message);

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        String value = replaceColon
                        .andThen(addBraces)
                        .apply("key:value");
        // Compose Function composes function in reverse order
        value = addBraces.compose(replaceColon).apply("key:value");

        System.out.println(value);
    }
}
