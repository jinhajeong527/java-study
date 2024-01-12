package lambdas;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {
    public static void show() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        // Imperative Programming -> implementing a login using an instruction
        // (for, if/else, switch/case)
        // How things to be done
        for (Integer item : list)
            System.out.println(item);

        // Declarative Programming: What needs to be done
        list.forEach(item -> System.out.println(item));
    }
}
