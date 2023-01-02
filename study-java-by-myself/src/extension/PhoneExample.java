package extension;

public class PhoneExample {
    public static void main(String[] args) {

        Phone phone = new SmartPhone("홍길동");
        phone.turnOff();
        phone.turnOn();

        SmartPhone smartPhone = new SmartPhone("홍길동");
        smartPhone.turnOff();
        smartPhone.turnOn();
        smartPhone.internetSearch();
    }
}
