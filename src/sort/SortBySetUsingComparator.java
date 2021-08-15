package sort;

import java.util.*;

public class SortBySetUsingComparator {
    /**
     * 2.6. Способы сортировки. Сортировка Collection.
     * Сортировка через Set с использованием компаратора
     *
     * Что делать, если нам нужно получить отсортированный Set
     * по определенному компаратору? Мы можем создать сет с компаратором
     * и добавить все элементы в сет.
     *
     * Например:
     *
     * List<Integer> list = List.of(1, 2, 3);
     *
     * Set<Integer> set = new TreeSet(Comparator.reverseOrder());
     *
     * set.addAll(list);
     *
     * @param list параметры метода
     * @return задача получить сет из списка с порядком по убыванию.
     * Среди элементов нет null.
     */
    public static Set<String> sort(List<String> list) {
        Set<String> set = new TreeSet<>(Comparator.reverseOrder());
        set.addAll(list);
        return set;
    }
}
