package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class RunningOnCompletionDemo {
    public static void main(String[] args) {
        show();
    }
    public static void show() {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 1);
        future.thenRun(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });
        future.thenAccept(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });
        future.thenAcceptAsync(result -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
