package nested;

public class AwithUseRestriction {
    int field1;
    void method1() {
        System.out.println("field1: " + field1);
    }

    static int field2;
    static void method2() {
        System.out.println("field2: " + field2);
    }

    class B {
        void method() {
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            //field1 = 10;
            //method1();

            field2 = 5;
            method2();
        }
    }
}
