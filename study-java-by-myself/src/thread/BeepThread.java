package thread;

import java.awt.*;

public class BeepThread extends Thread {
    // Thread의 하위 클래스로 작업 클래스를 정의하기.
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i<5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch(Exception e) {}
        }
    }
}
