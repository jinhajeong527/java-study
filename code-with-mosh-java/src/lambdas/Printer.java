package lambdas;

public interface Printer {
    // single abstract method --> then Functional Interface
    void print(String message);
    // 자바에서는 이제 인터페이스에서 디폴트 메서드를 가질 수 있다.
    // body를 가질 수 있다.
    // But can be bad approach....

//    default void printTwice(String message) {
//        System.out.println(message);
//        System.out.println(message);
//    }
}
