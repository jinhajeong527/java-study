package concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemoRaceCondition {
    public static void show() {

        // 모든 쓰레드를 동시에 실행시키기 위해 리스트에 담는다.
        List<Thread> threadList = new ArrayList<>();
        DownloadStatus status = new DownloadStatus();
        // 10개의 쓰레드를 실행하고, 모든 쓰레드가 complete 됐을 경우에 total number of bytes downloaded를 체크할 것이다.
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
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
        System.out.println("test " + status.getTotalBytes());
    }

}
