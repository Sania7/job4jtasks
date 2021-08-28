package streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysStreamMethod {
    /**
     * 1.3. Создание стрима из массива. Метод Arrays.stream()
     * Массивы это часто используемая конструкция,
     * поэтому важно знать как создать стрим из массива.
     * Для создания стрима служит метод Arrays.stream()
     *
     * Например,
     *
     * Integer[] data = {1, 2, 3};
     *
     * Stream<Integer> stream = Arrays.stream(data);
     *
     *
     * @param data параметры метода
     * @return вам нужно создать стрим из переданного массива
     */
    public static Stream<Integer> createStream(Integer[] data) {
        return Arrays.stream(data);
    }
}
