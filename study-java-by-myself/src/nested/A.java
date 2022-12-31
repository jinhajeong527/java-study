package nested;

public class A {
    B field1 = new B();
    C field2 = new C();
    // 인스탠스 메서드
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }
    // 정적 필드 초기화
    //static B field3 = new B();
    static C field4 = new C();

    static void method2() {
        //B var1 = new B();
        C var2 = new C();
    }


    public A() {
        System.out.println("A 객체가 생성됨");
    }
    // 인스탠스 멤버 클래스
    class B {
        B() {
            System.out.println("B 객체가 생성됨");
        }
        int field1;
        // static int field2;
        void method1() {}
        // static void method2() {}
    }
    // 정적 멤버 클래스
    static class C {
        C() {
            System.out.println("C 객체가 생성됨");
        }
        int field1;
        static int field2;
        void method1() {}
        static void method2() {}
    }

    void method() {
        class D {
            D() {
                System.out.println("D 객체가 생성됨");
            }
            int field1;
            void method() {}
        }
        // 로컬 클래스는 선언 메서드 내부에서 사용된다.
        D d = new D();
        d.field1 = 3;
        d.method();
    }
}
