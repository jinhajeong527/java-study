
package thread.stop;

public class InterruptExample {
    public static void main(String[] args) {
        PrintThread2 printThread2 = new PrintThread2();
        printThread2.start();

        PrintThread3 printThread3 = new PrintThread3();
        printThread3.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        // 스레드를 종료하기 위해 InterruptedException 발생시키게 된다.
        printThread2.interrupt();
        printThread3.interrupt();

    }
}
