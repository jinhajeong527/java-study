package executors;

import java.util.concurrent.CompletableFuture;

public class MailService {
    public void send() {
        // Whenever filesystem or the network is involved, we're dealing with a long running operation
        // main thread가 아닌 별개의 thread에서 해당 작업을 실행시켜야 한다.
        LongTask.simulate();
        System.out.println("Mail was sent.");
    }

    public CompletableFuture<Void> sendAsync() {
        // common thread pool에 있는 separate thread를 통해 실행될 것이다.
        return CompletableFuture.runAsync(() -> send());
    }
}
