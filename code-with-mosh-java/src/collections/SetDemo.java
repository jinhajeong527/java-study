package collections;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        // list or collection을 set 생성자 인자로 넣으면 duplicates are gone
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c", "c");
        Set<String> hashSet = new HashSet<>(collection);
        System.out.println(hashSet);


        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));

        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union Operation
        set1.addAll(set2);
        System.out.println(set1);

        // Intersection
        // Keep all the items in set2 and remove everything from set1
        set1.retainAll(set2);
        System.out.println(set1);

        // Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
