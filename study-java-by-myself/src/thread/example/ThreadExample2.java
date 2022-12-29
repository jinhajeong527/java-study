package thread.example;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thread = new MovieThread2();
        thread.start();
        try{ Thread.sleep(100); } catch(InterruptedException e) {}
        thread.interrupt();
    }
}
