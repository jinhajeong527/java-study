package thread;

public class BeepPrintExample4 {
    public static void main(String[] args) {
        // Thread의 하위 클래스
        // 새로운 스레드에 의해 실행된다.
        Thread thread = new BeepThread();
        thread.start();
        // 아래의 작업은 메인 스레드에 의해 실행된다.
        for(int i=0; i<5; i++) {
            System.out.println("띵");
            try{ Thread.sleep(500); }
            catch(Exception e) {}
        }
    }
}
