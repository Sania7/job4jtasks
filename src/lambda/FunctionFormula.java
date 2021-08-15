package lambda;

import java.util.function.Function;

public class FunctionFormula {
    /**
     * 2.3. Fuction. Рассчитать значение по формуле
     * @param x параметры метода
     * @return лямбда выражение, которое будет подставлять переданное число в формулу
     */
    public static double calculate(double x) {
         return calculate(num -> num * num + 2 * num + 1, x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
