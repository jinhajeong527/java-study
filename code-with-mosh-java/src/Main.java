import concurrency.ThreadDemo;
import concurrency.ThreadDemoJoin;
import concurrency.ThreadDemoRaceCondition;
import concurrency.ThreadDemoVolatile;

public class Main {
    public static void main(String[] args) {
        // main thread, garbage collector running thread
        System.out.println(Thread.activeCount()); // 2
        // to get the total number of the thread
        // 8개의 쓰레드가 사용 가능하다.
        // 각각의 코어는 두 개의 쓰레드를 사용 가능하다.
        System.out.println(Runtime.getRuntime().availableProcessors()); // 8
//        ThreadDemo.show();
//        ThreadDemoJoin.show();
//        ThreadDemoRaceCondition.show();
        ThreadDemoVolatile.show();
    }
}