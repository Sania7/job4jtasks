package sort;

import java.util.Arrays;

public class ArraysSort {
    /**
     *2.1. Способы сортировки. Сортировка массива примитивов
     *
     * Иногда нужно бывает отсортировать массив.
     * Для этого есть метод void Arrays.sort(массив),
     * который сортирует примитивы в восходящем порядке.
     *
     * Например,
     *
     * int[] data = {3, 2, 1};
     *
     * Arrays.sort(data); // теперь массив будет {1, 2, 3}
     *
     * @param data параметры метода
     * @return задача отсортировать переданный массив и вернуть его
     */
    public static long[] sort(long[] data) {
        Arrays.sort(data);
        return data;
    }
}
