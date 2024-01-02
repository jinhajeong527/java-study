import generics.GenericList;
import generics.User;
import generics.Utils;


public class Main {
    public static void main(String[] args) {
        User user = Utils.max(new User(20), new User(30));
        System.out.println(user);
    }
}