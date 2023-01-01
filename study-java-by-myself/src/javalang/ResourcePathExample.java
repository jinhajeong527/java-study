package javalang;

import sun.util.resources.cldr.en.CalendarData_en_AU;

public class ResourcePathExample { // 리소스 절대경로 얻기
    public static void main(String[] args) {
        Class clazz = Member.class;

        String photo1Path = clazz.getResource("photo1.png").getPath();
        System.out.println(photo1Path);
    }
}
