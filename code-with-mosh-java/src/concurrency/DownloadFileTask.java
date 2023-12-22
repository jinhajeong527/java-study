package concurrency;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask() {
    }

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Download a file " + Thread.currentThread().getName());

        for (int i = 0; i < 10_000; i++) {
            // 쓰레드 멈춰달라는 요청 없을 경우 계속해서 다운로드 진행한다.
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        System.out.println("Download complete " + Thread.currentThread().getName());
    }
}
