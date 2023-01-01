package javalang;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes);
        // 맥 오에스는 엔터누를 경우에 캐리지 리턴은 없고(\r) 라인 피트만 있다(\n)
        // 따라서 바이트 배열에 13, 10이 내용이 같이 입력되는 것이 아니라 라인피트 값인 10만 입력된다.
        String str = new String(bytes, 0, readByteNo - 1);
        System.out.println(str);
    }
}
