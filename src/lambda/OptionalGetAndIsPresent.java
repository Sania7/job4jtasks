package lambda;

import java.util.Optional;

public class OptionalGetAndIsPresent {
    /**
     * 5.2. Optional. Методы isPresent(), isEmpty(), get()
     *
     * Для того, чтобы проверить, что в Optional есть значение или нет,
     * можно использовать метод isPresent(), isEmpty().
     *
     * Например,
     *
     * Optional.of(1).isPresent(); // даст true
     *
     * Optional.empty().isEmpty(); // даст true
     *
     * Для получения значения, которое мы поместили с помощью метода of()
     * мы можем использовать метод get()
     *
     * Например,
     *
     * Optional.of(1).get() // Вернет 1
     *
     * Optilnal.empty().get() // Вернет исключение!
     *
     * Запомните, перед вызовом метода get() всегда нужно использовать isPresent().
     * В этом суть Optional, чтобы программист не забывал делать проверки.
     *
     * @param data параметры метода
     * @param el параметры метода
     * @return В методе get() нужно вызвать метод indexOf().
     * Если вернулся пустой Optinal, то метод должен вернуть -1,
     * в противном случае сам индекс
     */
    public static int get(int[] data, int el) {
        return OptionalGetAndIsPresent.indexOf(data, el)
                .isPresent()
                ? (int) OptionalGetAndIsPresent
                .indexOf(data, el).get() : -1;
    }

    /**
     *
     *
     * @param data
     * @param el
     * @return Написать метод indexOf(). Он ищет индекс по значению.
     * Если индекс не найден, должно вернуться Optional.empty().
     * Если найден, то Optional из этого индекса
     */
    public static Optional<Integer> indexOf(int[] data, int el) {
        if (data.length != 0) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == el) {
                    return Optional.of(i);
                }
            }
        }
        return Optional.empty();
    }
}