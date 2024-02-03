package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show() {
//        Runtime.getRuntime().availableProcessors();
//        ForkJoinPool.commonPool();
        Runnable task = () -> System.out.println("a");
        Supplier<Integer> task2 = () -> 1;
        // executor를 따로 지정하지 않으면, task를 common pool에서 실행시킬 것이다.
        CompletableFuture<Void> result = CompletableFuture.runAsync(task);
        // 비동기 방식으로 태스크를 실행했다.
        // executor를 만들어서, 태스크를 submit하고,
        // shut it down 할 필요가 없었다.
        // value를 리턴하는 태스크라면 runAsync 대신에 supplyAsync를 사용하면 된다.
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(task2);
        try {
            // blocking method
            int number = future.get();
            System.out.println(number);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
