package streamapi;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraysStreamForPrimitive {
    /**
     * 1.6. Создание стрима примитивов. Метод Arrays.stream()
     * Класс Stream работает с объектами.
     * Для представления стрима примитивов в Java есть свои классы:
     * IntStream, LongStream, DoubleStream.
     *
     * Их можно создавать как мы создавали раньше.
     * Чаще всего приходиться создавать стрим из массива примитивов.
     * Для этого лучше всего подходит метод Arrays.stream(). Например
     *
     * int[] data = {1, 2, 3};
     *
     * IntStream steam = Arrays.stream(data);
     *
     * @param data параметры метода
     * @return задача создать стрим из переданного массива
     */
    public static IntStream createStream(int[] data) {
        return Arrays.stream(data);
    }
}
