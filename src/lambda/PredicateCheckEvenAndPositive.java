package lambda;

import java.util.function.Predicate;

public class PredicateCheckEvenAndPositive {
    /**
     * 1.3. Predicate. Проверить, что число положительное и четное
     *
     * @param num
     * @return дописать лямбда выражение, которое проверяет,
     * что число четное и положительное
     */
    public static boolean check(int num) {
         return check(a -> (a % 2 == 0) && (a > 0), num);
    }

    private static boolean check(Predicate<Integer> predicate, int num) {
        return predicate.test(num);
    }
}
