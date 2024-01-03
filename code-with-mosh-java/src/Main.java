import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;

import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        GenericList list = new GenericList<String>();
        list.add("a");
        list.add("b");

        for (Object word : list) {
            System.out.println(word);
        }
    }
}