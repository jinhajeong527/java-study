package lambdas;

public class LambdasDemo {
    public static void show() {
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
