package concurrency;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());

        for(int i = 0; i < 10; i++) {
            //Runnable target --> 스레드 위에서 실행되는 TASK
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
