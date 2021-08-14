package sort;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortWithObject {
    /**
     * 2.2. Способы сортировки. Сортировка массива объектов
     *В утилитном классе Arrays есть метод для сортировки массива объектов void
     *  sort(массив, компаратор)
     *
     * Например:
     *
     * Integer[] data = {3, 2, 1};
     *
     * Arrays.sort(data, Comparator.naturalOrder()); // теперь массив станет {1, 2, 3}
     *
     * @param data параметры метода
     * @return Ваша задача отсортировать массив строк в убывающем порядке и вернуть его.
     * Среди строк нет null элементов.
     */
    public static String[] sort(String[] data) {
       Arrays.sort(data, Comparator.reverseOrder());
        return data;
    }
}
