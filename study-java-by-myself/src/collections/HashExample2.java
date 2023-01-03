package collections;

import java.util.HashSet;
import java.util.Set;

public class HashExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("정진하", 29));
        set.add(new Member("정진하", 29));

        System.out.println("총 객체수: " + set.size());
    }
}
