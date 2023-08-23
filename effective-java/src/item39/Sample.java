package item39;

public class Sample {
    @Test public static void m1() {}
    public static void m2() {}
    @Test public static void m3() {
        throw new RuntimeException("실패");
    }
    public static void m4() {}
    @Test public void m5() {} // 정적 메서드가 아니어서 잘못사용한 예
    public static void m6() {}
    @Test public static void m7() {
        throw new RuntimeException("실패"); // 실패해야 한다.
    }
    public static void m8() {}

}
