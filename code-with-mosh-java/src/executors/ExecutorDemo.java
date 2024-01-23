package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void show() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println(executorService.getClass().getName()); // ThreadPoolExecutor
        try {
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        finally {
            executorService.shutdown();
        }

    }
}
