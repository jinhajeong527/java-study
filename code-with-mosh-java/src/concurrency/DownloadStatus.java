package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private Lock lock = new ReentrantLock();
    public int getTotalBytes() {
        return totalBytes;
    }
    public void incrementTotalBytes() {
        lock.lock();
        try {
            totalBytes++;
        }
        // finally block 안에 있어야 한다.
        // exception이 thrown 됐을 때 lock이 locked 된 상태로 있길 원하지 않기 때문이다.
        // 다른 쓰레드가 이 코드를 실행할 수 없기 때문이다. 데드락 발생할 수 있고,
        // our application will crash
        finally {
            lock.unlock();
        }
    }
}
