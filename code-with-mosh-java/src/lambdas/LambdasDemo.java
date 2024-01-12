package lambdas;

import java.util.function.Consumer;

public class LambdasDemo {
    public LambdasDemo() {
    }

    public LambdasDemo(String message) {

    }
    public static void print(String messsage) {}
    public void print_instance(String message) {}
    public static String prefixStatic = "-";
    public String prefixInstance = "-";
    // enclosing class의 static, instance 필드에만 접근 가능
    // 혹은 로컬 변수 접근 가능
    public void show_instance() {
        greet(message -> System.out.println(this.prefixInstance + message));
    }

    public static void show() {
        // 생성자 method references
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);

        greet(message -> print(message)); // 여기서 프린트 메서드는 프린터 인터페이스 구현 메서드라고 할 수 있다.
        greet(LambdasDemo::print); // Method Reference
        // 인스턴스 메서드로 Printer 인터페이스 구현메서드 선언했을 경우
        LambdasDemo demo = new LambdasDemo();
        greet(message -> demo.print_instance(message));
        greet(demo::print_instance);

        // functional interface를 람다 표현식을 사용해서 represent해도 된다.
        greet((String massage) -> { System.out.println(massage);});

        // Class/Object::method

        greet((massage) -> {
            System.out.println(massage);
        });

        greet(massage -> System.out.println(massage));
        greet(System.out::println);

        String prefix = "-";
        greet(massage -> System.out.println(prefix + massage));
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
