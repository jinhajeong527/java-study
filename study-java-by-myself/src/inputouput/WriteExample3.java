package inputouput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample3 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test3.db");

        byte[] array = {10,20,30,40,50};
        os.write(array, 1, 3);

        os.flush();
        os.close();

    }
}
