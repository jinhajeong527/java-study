package inputouput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample5 {
    public static void main(String[] args) throws IOException {

        Reader reader = new FileReader("/Users/jinhajeong/workspace/java-study/study-java-by-myself/file/test8.txt");

        char[] buffer = new char[100];

        while(true) {
            int readCharNum = reader.read(buffer);
            if(readCharNum == -1) break;
            for(int i =0; i<readCharNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();
    }
}
