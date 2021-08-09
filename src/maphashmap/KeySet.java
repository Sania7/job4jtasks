package maphashmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class KeySet {
    /**
     * 1.3. Получить значения отображения по ключу.
     * Рассмотрим 2 очень простых, но очень важных метода,
     * которые будут использоваться в Вашей практике очень часто:
     *
     * V get(K key) - метод возвращает значение объекта,
     * которому соответствует ключ key.
     * Если вдруг окажется, что такого элемента нет - то метод вернет null.
     *
     * Set<K> keySet() - возвращает набор всех ключей отображения.
     *
     * Важно упомянуть,
     * что отображение не позволяет хранить 2 значения по одинаковому ключу,
     * т.е. ключ для отображения - уникальный идентификатор.
     * При этом в качестве ключа допускается использовать null
     * (допускается не означает, что это хорошая идея).
     * При этом ключ со значением null может быть только один.
     *
     * Задание: Вам необходимо раскомментировать код,
     * заполнить пропуски (обозначены ...) так,
     * чтобы в консоль были выведены все значения отображения.
     * При этом необходимо использовать метод keySet() и get().
     * @param args
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(
                Map.of(
                        1,"root@root",
                        2, "local@local",
                        3, "host@host"
                )
        );
        for (Integer i : map.keySet()) {
            String key = i.toString();
            String value = map.get(i);
            System.out.println(key + " - " + value);
        }

        System.out.println(Arrays.asList(map));
        System.out.println(Collections.singletonList(map));

        System.out.println(Arrays.toString(map.entrySet().toArray()));

        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
