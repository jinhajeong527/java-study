package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) < 0 ? second : first;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }
    // class CAP#1 extends User {}
    // class Instructor extends User
    public static void printUsers
            (GenericList<? extends User> users) {
        // wild card character -> unknown type
        User x = users.get(0);
// 추가하고 싶다면 extends 대신에 super를 쓰면 된다.
//        users.add(new User(10));
//        users.add(new Instructor(20));
//        Object x = users.get(0);
//        User user = users.get(0); --> 이건 안된
    }
}
