package thread;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        // 비프음을 들려주는 작업을 정의한 Runnable 구현한 클래스
        Runnable beepTask = new BeepTask();
        // 이것을 매개값으로 작업 스레드를 생성한다.
        Thread thread = new Thread(beepTask);
        thread.start();

        for(int i =0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}
