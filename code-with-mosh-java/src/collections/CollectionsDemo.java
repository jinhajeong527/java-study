package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();

        collection.add("a");
        collection.add("b");
        collection.add("c");

        Collections.addAll(collection, "a", "b", "c");

        System.out.println(collection.size());

        collection.remove("a");

        for (String item: collection) {
            System.out.println(item);
        }
        boolean containsA = collection.contains("a");
        System.out.println(containsA);

        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]); // 0 넘기는 것 convention

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other); // false
        System.out.println(collection.equals(other)); // true

        collection.clear();
        System.out.println(collection);

    }
}
