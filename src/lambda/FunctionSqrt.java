package lambda;

import java.util.function.Function;

public class FunctionSqrt {
    /**
     * 2.2. Fuction. Получить корень квадратный из числа
     *
     * @param x параметры метода
     * @return лямбда выражение, которое извлекает корень квадратный из числа
     */
    public static double calculate(double x) {
        return calculate(a -> Math.sqrt(a), x);
    }

    public static double calculate(Function<Double, Double> y, double x) {
        return y.apply(x);
    }
}
