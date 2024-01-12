package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void show() {
//        List<Integer> list = Arrays.asList(1, 2, 3);
//        // Imperative Programming -> implementing a login using an instruction
//        // (for, if/else, switch/case)
//        // How things to be done
//        for (Integer item : list)
//            System.out.println(item);
//
//        // Declarative Programming: What needs to be done
//        list.forEach(item -> System.out.println(item));

        List<String> stringList = Arrays.asList("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
        stringList.forEach(print.andThen(printUpperCase));
    }
}
