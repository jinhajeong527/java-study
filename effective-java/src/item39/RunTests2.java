package item39;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunTests2 {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class<?> testClass = Class.forName(args[0]);
        for (Method m : testClass.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    m.invoke(null); // static method를 가정하고 호출한다. 인스턴스 메소드를 호출하려면 객체 인스턴스가 필요합니다.
                    System.out.printf("테스트 %s 실패: 예외를 던지지 않음%n", m);
                } catch(InvocationTargetException wrappedExc) {
                    Throwable exec = wrappedExc.getCause();
                    Class<? extends Throwable> excType = m.getAnnotation(ExceptionTest.class).value();
                    if(excType.isInstance(exec)) {
                        passed++;
                    } else {
                        System.out.printf("테스트 %s 실패: 기대한 예외 %s, 발생한 예외 %s%n", m, excType.getName(), exec);
                    }
                } catch (Exception exc) {
                    System.out.println("잘못 사용한 @ExceptionTest: " + m);
                }
            }
        }
        System.out.println(tests);

    }
}
