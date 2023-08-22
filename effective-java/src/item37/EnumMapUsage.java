package item37;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class EnumMapUsage {
    public static void main(String[] args) {
        Map<LifeCycle, Set<Plant>> plantsByLifeCycle =
                new EnumMap<>(LifeCycle.class);
        for (LifeCycle lc : LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());
        Plant plant = new Plant("flower", LifeCycle.ANNUAL);
        Plant plant2 = new Plant("flower2", LifeCycle.BIENNIAL);
        Plant plant3 = new Plant("flower3", LifeCycle.PERENNIAL);
        List<Plant> gardens = Arrays.asList(plant, plant2, plant3);
        for (Plant p : gardens)
            plantsByLifeCycle.get(p.lifeCycle).add(p);
        System.out.println(plantsByLifeCycle);

        System.out.println(gardens.stream()
                .collect(groupingBy(p -> p.lifeCycle,
                        () -> new EnumMap<>(LifeCycle.class), toSet())));
    }


}
