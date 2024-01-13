package lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
    public static void show() {
        BinaryOperator<Integer> add = (a, b) -> a + b;
        IntBinaryOperator add2 = (a, b) -> a + b;

        Function<Integer, Integer> square = a -> a * a;

        int result = add.andThen(square).apply(1,2);
        System.out.println(result); // 9

        UnaryOperator<Integer> squareNum = n -> n * n;
        UnaryOperator<Integer> increment = n -> n + 1;
        int value = increment.andThen(squareNum).apply(1);
        System.out.println(value);


    }
}
