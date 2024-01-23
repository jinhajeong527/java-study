package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorDemo {
    public static void show() {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        System.out.println(executorService.getClass().getName()); // ThreadPoolExecutor
        try {
            Future<Integer> future = executorService.submit(() -> {
                LongTask.simulate();
                return 1;
            });
            // 해당 String은 콘솔에서 바로 확인할 수 있을 것이다.
            System.out.println("Do more work");
            try {
                // 현재 스레드를 block하고, result of this operation이 ready할 때까지 기다린다.
                Integer result = future.get();
                System.out.println(result);
            } catch (ExecutionException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        } finally {
            executorService.shutdown();
        }

    }
}
