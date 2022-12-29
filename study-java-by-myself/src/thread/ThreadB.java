package thread;

public class ThreadB extends Thread { // 이름 설정 안한 ThreadB 클래스
    public void run() {
        for (int i=0; i<2; i++) {
            System.out.println(getName() + "가 출력한 내용");
        }
    }

}
