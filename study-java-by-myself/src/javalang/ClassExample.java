package javalang;

public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1)
        Class clazz = Member.class;

        // 2)
        Class clazz2 = Class.forName("javalang.Member");

        // 3)
        Member member = new Member("jinha");
        Class clazz3 = member.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());

        System.out.println();

        System.out.println(clazz2.getName());
        System.out.println(clazz2.getSimpleName());
        System.out.println(clazz2.getPackage().getName());

        System.out.println();

        System.out.println(clazz3.getName());
        System.out.println(clazz3.getSimpleName());
        System.out.println(clazz3.getPackage().getName());

        System.out.println();

        System.out.println(clazz == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
