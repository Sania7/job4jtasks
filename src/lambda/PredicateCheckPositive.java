package lambda;

import java.util.function.Predicate;

public class PredicateCheckPositive {
    /**
     *1.1. Predicate. Проверить, что число положительное
     * @param num параметры метода
     * @return дописать лямбда выражение, которое проверяет,
     * что число положительное
     */
    public static boolean check(int num) {
         return check(a -> a > 0, num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }

    public static void main(String[] args) {

    }
}
