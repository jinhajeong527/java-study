package inputouput.assist;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }

    public static void write(String str) throws Exception {
        FileOutputStream fos = new FileOutputStream("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test11.txt");
        Writer writer = new OutputStreamWriter(fos);
        // OutputStreamWriter 보조 스트림을 이용해서 문자 출력
        writer.write(str);
        writer.flush();
        writer.close();
    }

    public static String read() throws Exception {
        // FileInputStream에 InputStreamReader 보조 스트림을 연결
        FileInputStream fis = new FileInputStream("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test11.txt");
        Reader reader = new InputStreamReader(fis);
        char[] buffer = new char[100];
        int readCharNum = reader.read(buffer);
        System.out.println(readCharNum);
        reader.close();
        String data = new String(buffer, 0,  readCharNum);
        return data;
    }
}
