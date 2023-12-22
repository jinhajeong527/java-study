package inputouput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample5 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/text9.txt");

        char[] array = {'A', 'B', 'C', 'D', 'E'};

        writer.write(array, 1, 3);

        writer.flush();
        writer.close();

    }
}
