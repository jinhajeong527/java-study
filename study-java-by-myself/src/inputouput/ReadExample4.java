package inputouput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample4 {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test8.txt");
        while(true) {
            // 한 문자씩 읽기
            int data = reader.read();
            if(data == -1) break;
            System.out.println((char)data);
        }
        reader.close(); // 입력 스트림을 닫음
    }
}
