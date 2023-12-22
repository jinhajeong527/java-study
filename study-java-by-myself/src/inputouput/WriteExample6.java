package inputouput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample6 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test10.txt");

        String str = "ABC";

        writer.write(str);

        writer.flush(); // 출력 버퍼에 잔류하는 모든 문자열을 출력
        writer.close(); // 출력 스트림을 닫음
    }
}
