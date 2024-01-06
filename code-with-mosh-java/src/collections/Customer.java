package collections;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Customer other) {
        // this < other -> -1
        // this == other -> 0
        // this > other -> 1
        return name.compareTo(other.name);
        // 이름에 의해서만 비교하기 때문에 유연하지 않다.
        // 이메일이나 주소에 따라서 비교하고 싶다면? --> Comparator
    }

    @Override
    public String toString() {
        return name;
    }

}
