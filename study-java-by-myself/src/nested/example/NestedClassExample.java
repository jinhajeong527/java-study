package nested.example;

public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        // 인스탠스 정적 클래스
        Car.Tire tire = myCar.new Tire();
        // 정적 중첩 클래스
        Car.Engine engine = new Car.Engine();
    }
}
