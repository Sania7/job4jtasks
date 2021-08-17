package lambda;

import java.util.function.Predicate;

public class MRPredicate {
    /**
     * 4.3. Method reference и Predicate
     * @return задача создать предикат Predicate, который проверяет, что строка пустая,
     * для этого нужно использовать метод isEmpty() в классе String
     */
    public static Predicate<String> predicate() {
        return String::isEmpty;
    }
}
