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

        for (int i = 0; i < 1_000_000; i++) {
            // 쓰레드 멈춰달라는 요청 없을 경우 계속해서 다운로드 진행한다.
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }
        status.done();
        // 해당 오브젝트의 변화를 기다리는 쓰레드가 여러개일 때 notifyAll을 쓰면 유용하다.
        // synchronized 블락 안에서 실행하지 않으면 JVM이 런타임 예외를 던진다.
        synchronized (status) {
            status.notifyAll();
        }
        System.out.println("Download complete " + Thread.currentThread().getName());
    }
    public DownloadStatus getStatus() {
        return status;
    }
}
