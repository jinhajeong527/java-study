package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("정진하", 85);
        map.put("정진하", 100);
        map.put("정주연", 85);
        map.put("고은영", 85);
        System.out.println("총 Entry 수:" + map.size());

        System.out.println(map.get("정진하"));
        System.out.println();

        // 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        for(String key: keySet) {
            System.out.println("key:" + map.get(key));
        }

        while(keyIterator.hasNext()) {
            String key = keyIterator.next();;
            Integer value = map.get(key);
            System.out.println(key + "/ "+ value);
        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
        System.out.println();
        map.clear();
        System.out.println(map.size());

    }
}
