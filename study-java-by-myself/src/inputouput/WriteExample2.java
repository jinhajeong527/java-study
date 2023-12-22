package inputouput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test2.db");
        byte[] array = {10, 20, 30};
        // 배열의 모든 바이트를 출력
        os.write(array);
        // 출력 버퍼에 잔류하는 모든 바이트를 출력
        os.flush();
        // 출력 스트림을 닫음
        os.close();


    }
}
