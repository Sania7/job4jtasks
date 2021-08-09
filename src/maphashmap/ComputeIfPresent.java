package maphashmap;

import java.util.Map;

public class ComputeIfPresent {
    /**
     *1.5. Изменение уже существующей записи в отображении.
     * В Java 8 в интерфейс Map<K, V> были добавлены особые методы,
     * которые позволяют изменять записи в отображении с помощь лямбда-выражений.
     * Рассмотрим следующий метод:
     *
     * V computeIfPresent(K key, BiFunction<? super K, ? super V,? extends V>
     * remappingFunction) - если отображение содержит значение для указанного
     * ключа и не равно null, выполняется вычисление нового сопоставления ключ
     * - значение с учетом исходного ключа и текущего сопоставленного значения.
     *
     * @param name 1. Ключ - тип Integer, значение - тип String.
     *            При этом значение - это Имя,
     *            ключ - возрастающая последовательность, начиная с 1
     * @param surname 2. Ключ - тип Integer, значение - тип String.
     *               При этом значение - это Фамилия,
     *                ключ - возрастающая последовательность, начиная с 1
     *
     * @return Необходимо пройтись по первому отображению и к
     * значению имени добавить значение фамилии,
     * чтобы на выходе получилось отображение - ключ(число) -
     * значение(строка - имя + фамилия).
     */
    public static Map<Integer, String> collectData(Map<Integer, String> name, Map<Integer, String> surname) {
        for (Integer integer : name.keySet()) {
            name.computeIfPresent(integer, (key, value) -> value + " " + surname.get(integer));
        }
        return name;
    }
}
