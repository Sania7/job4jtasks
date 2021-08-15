package lambda;

import java.util.function.Function;

public class FunctionPow {
    /**
     * 2.1. Fuction. Возвести число в квадрат
     *
     * @param x параметры метода
     * @return лямбда выражение,
     * которое возводит переданное число в квадрат (для 2 = 4, для 3 = 9 и тд)
     */
    public static double calculate(double x) {
         return calculate(a -> (a * a), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
