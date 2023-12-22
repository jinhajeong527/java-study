package concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemoRaceCondition {
    public static void show() {
        DownloadStatus status = new DownloadStatus();
        // 모든 쓰레드를 동시에 실행시키기 위해 리스트에 담는다.
        List<Thread> threadList = new ArrayList<>();

        List<DownloadFileTask> tasks = new ArrayList<>();
        // 10개의 쓰레드를 실행하고, 모든 쓰레드가 complete 됐을 경우에 total number of bytes downloaded를 체크할 것이다.
        for (int i = 0; i < 10; i++) {
            DownloadFileTask task = new DownloadFileTask();
            tasks.add(task);

            Thread thread = new Thread(task);
            thread.start();
            threadList.add(thread);
        }
        for (Thread thread: threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
       int totalBytes = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
//              .reduce(0, (a, b) -> a+ b);
                .reduce(Integer::sum).get();

        System.out.println(totalBytes);
    }

}
