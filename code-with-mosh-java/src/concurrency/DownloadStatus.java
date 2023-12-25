package concurrency;


import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {

    private boolean isDone;
    private LongAdder totalBytes = new LongAdder();
    private int totalFiles;

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
        return totalBytes.intValue(); // sum()
    }
    public void incrementTotalFiles() {
        totalFiles++;
    }
    public void incrementTotalBytes() {
        totalBytes.increment();
    }
}
