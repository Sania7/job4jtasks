package streamapi;

import java.util.List;

public class MinMethod {
    /**
     * 0.5. Понятие редукции. Метод min(). Поиск кратчайшей строки
     * Как вы наверное уже догадались поиск минимального элемента
     * представляет собой также редукцию.
     * Этот метод принимает Comparator и возвращает Optional.
     * Если список пуст вернется пустой Optional.
     *
     * Пример,
     *
     * Integer min = List.of(3, 2, 1).stream().min((n1, n2) -> Integer.compare(n1, n2)).get(); // вернет 1
     * @param list параметры метода
     * @return задача найти строку с минимальной длиной. Размер списка больше 0
     */
    public static String min(List<String> list) {
        return list.stream().min(String::compareTo).get();
    }
}
