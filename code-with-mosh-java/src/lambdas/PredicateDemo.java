package lambdas;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void show() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        boolean result = isLongerThan5.test("sky");
        System.out.println(result); // false

        // 정반대의 일을하는 Predicate이 된다.
        Predicate<String> isShorterThan5 = isLongerThan5.negate();
        boolean result2 = isShorterThan5.test("sky");
        System.out.println(result2); // true

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
        boolean hasBraces = hasLeftAndRightBraces.test("{key:value}");
        System.out.println(hasBraces); // true

        Predicate<String> hasLeftOrRightBraces = hasLeftBrace.or(hasRightBrace);
        boolean hasAtLeastOneBrace = hasLeftOrRightBraces.test("Hello}");
        System.out.println(hasAtLeastOneBrace); // true


    }
}
