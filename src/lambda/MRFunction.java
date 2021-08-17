package lambda;

import java.util.function.Function;

public class MRFunction {
    /**
     * 4.2. Method reference и Function
     * @return задача создать Function через ссылку на метод.
     * В качестве функции нужно использовать Math.sqrt()
     */
    public static Function<Double, Double> apply() {
        return Math::sqrt;
    }
}
