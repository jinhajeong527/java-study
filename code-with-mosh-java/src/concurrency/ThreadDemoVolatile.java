package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadDemoVolatile {
    public static void show() {
        DownloadStatus status = new DownloadStatus();

        Thread thread1 = new Thread(new DownloadFileTask(status));
        Thread thread2 = new Thread(() -> {
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            System.out.println(status.getTotalBytes());
        });
        thread1.start();
        thread2.start();

    }
}
