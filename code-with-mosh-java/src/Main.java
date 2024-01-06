import collections.CollectionsDemo;
import collections.Customer;
import collections.ListDemo;
import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("a"));
        customers.add(new Customer("d"));
        customers.add(new Customer("b"));
        Collections.sort(customers);
        System.out.println(customers);
    }
}