package lambda;

import java.util.function.Predicate;

public class PredicateCheckEven {
    /**
     * 1.2. Predicate. Проверить, что число четное
     * @param num параметры метода
     * @return  дописать лямбда выражение, которое проверяет, что число четное
     */
    public static boolean check(int num) {
        return check(a -> (a % 2) == 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
