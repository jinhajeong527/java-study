package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    public static void show() {
        List<Customer> customers = new ArrayList<>();
        // O(n)
        for (Customer customer : customers) {
            if (customer.getEmail() == "e1")
                System.out.println("Found!");
        }

        // 자바의 해시테이블 -> Maps 0(1)
        Customer c1 = new Customer("a", "e1");
        Customer c2 = new Customer("b", "e2");
        Customer c3 = new Customer("c", "e3");
        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);
        map.put(c3.getEmail(), c3);
        Customer customer1 = map.get("e10");
        Customer unknown = new Customer("Unknown", "");
        Customer customer2 = map.getOrDefault("e10", unknown);
        System.out.println(customer2);
        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Map.Entry<String,Customer> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        for (Customer customer : map.values()) {
            System.out.println(customer);
        }





    }
}
