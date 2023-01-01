package javalang;

public class MathExample {
    public static void main(String[] args) {

        double v11 = Math.random();
        System.out.println(v11);

        double v12 = Math.rint(5.3);
        double v13 = Math.rint(5.7);
        System.out.println(v12); // 5.0
        System.out.println(v13); // 6.0

        // round() 메서드는 항상 소수점 첫째자리에서 반올림해서 정수값을 리턴한다.
        long v14 = Math.round(5.3);// 5
        long v15 = Math.round(5.7);// 6
        System.out.println(v14);
        System.out.println(v15);

        double value = 12.3456;
        double temp1 = value * 100;
        long temp2 = Math.round(temp1);
        System.out.println(temp2);
        double v16 = temp2 / 100.0;
        System.out.println("v16="+ v16);


    }
}
