package streamapi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Test {
    public static void main(String[] args) {
        // в созданной нами коллекции будет сохранен наш результат
        Supplier<Deque<Integer>> supplier = LinkedList::new;
        // здесь мы указываем как будем собирать элементы в коллекцию
        BiConsumer<Deque<Integer>, Integer> biConsumer = Deque::addFirst;
        // так нужно просто прописать. Оператор используется для совмещения
        // результатов параллельных вычислений
        BinaryOperator<Deque<Integer>> operator = (left, right) -> {
            right.forEach(left::addFirst);
            return left;
        };
        Deque<Integer> result = List.of(1, 2, 3).stream()
                .collect(Collector.of(
                        supplier,
                        biConsumer,
                        operator
                ));
        result.forEach(System.out::println);
    }
}
