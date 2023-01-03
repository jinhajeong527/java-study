package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 97);
        map.put("red", 95);
        map.put("green", 94);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;

        for(String key : map.keySet()) {
            if(maxScore < map.get(key)) {
                maxScore = map.get(key);
                name = key;
            }
                totalScore += map.get(key);
        }
        System.out.println("평균 점수: " + (double)totalScore/map.size());
        System.out.println("최고 점수: " + maxScore);
        System.out.println("최고 점수 받은 아이디: " + name);
    }
}
