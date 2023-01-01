package javalang;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
        // 재정의된 toString() 호출
        String strObj = myPhone.toString();
        System.out.println(strObj);

        // 재정의된 toString 호출하고 리턴값 받아 출력
        System.out.println(myPhone);
    }
}
