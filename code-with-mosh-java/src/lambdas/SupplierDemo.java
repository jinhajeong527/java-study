package lambdas;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void show() {
        Supplier<Double> getRandom = () -> Math.random();
        double random = getRandom.get();
        System.out.println(random);

        BooleanSupplier tellMeYesOrNo = () -> {
            double num = Math.random() * 1000;
            int intNum = (int) num;
            if (intNum%2==0) return true;
            else return false;
        };
        boolean isYes = tellMeYesOrNo.getAsBoolean();
        System.out.println(isYes);
    }
}
