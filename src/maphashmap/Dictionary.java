package maphashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    /**
     * 2.2. Реализовать словарь.
     * В данном задании необходимо реализовать словарь.
     * Метод принимает массив строк.
     * Необходимо перебрать массив и добавить строки в карту таким образом,
     * чтобы ключом был первый символ строки,
     * а значением - список строк, которые начинаются на первый символ строки.
     *
     * @param strings параметры метода
     * @return возвращаемое значение
     */
    public static Map<String, List<String>> collectData(String[] strings) {
        // создаем новую мапу для хранения результата
        Map<String, List<String>> rsl = new HashMap<>();
        // проходим циклом по массиву из параметров метода
        for (String string : strings) {
            // преобразовываем данные и берем первое число из строки
            String charAt = String.valueOf(string.charAt(0));
            rsl.putIfAbsent(charAt, new ArrayList<>());
            rsl.get(charAt).add(string);
        }
        return rsl;
    }
}
