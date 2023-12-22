package inputouput.assist;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader(
                ReadLineExample.class.getResource("language.txt").getPath()
        );
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            //라인 단위 문자열을 읽고 리턴
            String data = br.readLine();
            if(data == null) break;
            System.out.println(data);
        }

        br.close();
    }
}
