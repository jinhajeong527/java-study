package item39;

import java.lang.reflect.*;

public class RunTests {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(args[0]);
        System.out.println();
        for (Method m : testClass.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null); // static method를 가정하고 호출한다. 인스턴스 메소드를 호출하려면 객체 인스턴스가 필요합니다.
                    passed++;
                } catch(InvocationTargetException wrappedExc) {
                    Throwable exec = wrappedExc.getCause();
                    System.out.println(m + " 실패: " + exec);
                } catch (Exception exc) {
                    System.out.println("잘못 사용한 @Test: " + m);
                }
            }
            System.out.printf("성공: %d, 실패 : %d%n", passed, tests-passed);
        }

    }
}
