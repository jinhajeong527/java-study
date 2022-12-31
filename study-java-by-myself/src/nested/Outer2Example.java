package nested;

public class Outer2Example {
    public static void main(String[] args) {
        Outter2 outter = new Outter2();
        Outter2.Nestted nested = outter.new Nestted();
        nested.print();
    }
}
