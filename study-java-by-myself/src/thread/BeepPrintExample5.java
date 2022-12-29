package thread;

import java.awt.*;

public class BeepPrintExample5 {
    public static void main(String[] args) {
        // Thread 익명 자식 객체 이용하기
        Thread thread =  new Thread() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++) {
                    toolkit.beep();
                    try { Thread.sleep(500); } catch (Exception e) {}
                }
            }
        };
        thread.start();

        for(int i = 0; i<5; i++) {
            System.out.println("띵");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
