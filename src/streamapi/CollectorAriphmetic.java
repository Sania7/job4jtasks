package streamapi;

import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class CollectorAriphmetic {
    /**
     * 0.2. Понятие редукции. Произвольный Collector для подсчета
     *
     * @param list параметры списка
     * @return задача дописать метод, чтобы он умножал элементы списка
     */
    public static Integer collect(List<Integer> list) {
        Supplier<List<Integer>> supplier = LinkedList::new;
        BiConsumer<List<Integer>, Integer> consumer = List::add;
        BinaryOperator<List<Integer>> merger = (xs, ys) -> {
            xs.addAll(ys);
            return xs;
        };
        Function<List<Integer>, Integer> function = (ns) -> {
            // your code here
            int rsl = 1;
            for (var n : ns) {
                rsl *= n;
            }
            return rsl;
        };
        return list.stream()
                .collect(Collector.of(supplier, consumer, merger, function));
    }
}
