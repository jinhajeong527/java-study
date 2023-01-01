package javalang.example;

import java.util.HashMap;
import java.util.Map;

public class StudentExample {
    public static void main(String[] args) {
        // Student 키로 총점을 저장하는 HashMap 객체 생성
        Map<Student, String> hashMap = new HashMap<>();

        hashMap.put(new Student("1"), "95");

        String score = hashMap.get(new Student("1"));
        System.out.println("1번 학생의 총점: " + score);

    }
}
