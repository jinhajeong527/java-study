package inputouput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test2.db");
        byte[] buffer = new byte[100];
        while(true) {
            int readByteNum = is.read(buffer);
            System.out.println(readByteNum);
            if(readByteNum == -1)  break;
            for(int i = 0; i<readByteNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        ;

        is.close();
    }
}
