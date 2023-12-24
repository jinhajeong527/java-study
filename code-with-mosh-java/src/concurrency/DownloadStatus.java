package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {

    private boolean isDone;
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;

    private Object totalBytesLock = new Object();
    private Object totalFilesLock = new Object();

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }

    public int getTotalFiles() {
        return totalFiles;
    }
    public int getTotalBytes() {
        return totalBytes.get();
    }
    public void incrementTotalFiles() {
        totalFiles++;
    }
    public void incrementTotalBytes() {
        totalBytes.incrementAndGet(); // ++a
    }
}
