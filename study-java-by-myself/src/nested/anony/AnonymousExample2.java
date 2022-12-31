package nested.anony;

public class AnonymousExample2 {
    public static void main(String[] args) {
        Anonymous2 anonymous2 = new Anonymous2();
        // 익명 객체 필드 사용
        anonymous2.field.turnOn();
        // 익명 객체 로컬 변수 사용
        anonymous2.method1();
        // 익명 객체 매개값 사용
        anonymous2.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTV를 켭니다.");
            }
            @Override
            public void turnOff() {
                System.out.println("SmartTV를 끕니다.");
            }
        });
    }
}
