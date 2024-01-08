package lambdas;

public class LambdasDemo {

    public static void show() {
        // functional interface를 람다 표현식을 사용해서 represent해도 된다.
        greet((String massage) -> {
            System.out.println(massage);
        });

        greet((massage) -> {
            System.out.println(massage);
        });

        greet(massage -> {
            System.out.println(massage);
        });

        greet(massage -> System.out.println(massage));
        // 람다 표현식은 essentially object이지만
        // 익명 함수를 표현하기 위해 사용될 수 있다.
        Printer printer = message -> System.out.println(message);

        greet(new Printer() {
            // 익명 클래스
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }
    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
