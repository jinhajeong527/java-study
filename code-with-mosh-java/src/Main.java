import generics.GenericList;
import generics.Instructor;
import generics.User;
import generics.Utils;


public class Main {
    public static void main(String[] args) {
        // basic OOP
        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));

        GenericList<Instructor> users = new GenericList<>();
//        GenericList<User> users = new GenericList<User>();
        Utils.printUsers(users);
    }
}