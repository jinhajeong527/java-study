package inputouput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample4 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test8.txt");

        char[] array = {'A', 'B', 'C'};

        writer.write(array); // 배열의 모든 문자를 출력

        writer.flush();
        writer.close();
    }
}
