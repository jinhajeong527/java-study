package ifs;

public class MyClass { // 인터페이스 사용하기
    //필드로 사용하기
    RemoteControl rc = new Television();
    public MyClass() {
    }
    // 생성자 사용하기
    public MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }
    // 메소드의 매개 변수
    void methodA() {
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void methodB(RemoteControl rc) {
        // 생성자의 매개값으로 구현 객체 대입
        rc.turnOn();
        rc.setVolume(5);
    }
}
