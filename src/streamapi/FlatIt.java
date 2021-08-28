package streamapi;

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FlatIt {
    /**
     *1. flatMap для итератора
     * @param it параметры метода
     * @return Нужно написать метод,
     * который соберет все элементы данных итераторов в List.
     */
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        List<Integer> rsl = new ArrayList<>();
        while (it.hasNext()) {
            Iterator<Integer> iterator = it.next();
            while (iterator.hasNext()) {
                rsl.add(iterator.next());
            }
        }
        return rsl;
    }
    private static <T> Stream<T> iteratorToStream(Iterator<T> it) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED), false);
    }
}
