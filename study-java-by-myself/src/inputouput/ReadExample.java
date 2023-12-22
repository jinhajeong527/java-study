package inputouput;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test.db");
        while(true) {
            int data = is.read();
            if(data == -1) break;
            System.out.println(data);
        }
        is.close();
    }
}
