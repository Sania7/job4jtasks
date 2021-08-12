package maphashmap;

import java.util.HashMap;
import java.util.Map;

public class NonUniqueString {
    /**
     * 2.1. Массив строк с повторяющимися значениями.
     *
     * Метод принимает массив строк, в котором строки могут повторяться.
     * Необходимо перебрать массив строк и сложить их в карту.
     * При этом должны выполниться следующие условия:
     * 1. Ключом является строка.
     * 2. Значением будет булево переменная.
     * 3. Если строка встречается в массиве 2 и более раз,
     * то булево значение должно быть true.
     * В ином случае - должно принимать значение false.
     *
     * @param strings входные параметры метода
     * @return возвращаемое значение
     */
    public static Map<String, Boolean> checkData(String[] strings) {
        // создаем мапу с параметрами метода
        Map<String, Boolean> map = new HashMap<>();
        // проходим по ней циклом
        for (String string : strings) {
            // с помощью метода computeIfPresent() проверяем сколько раз встречается
            map.computeIfPresent(string, (key, val) -> true);
            // если нет то false
            map.putIfAbsent(string, false);
        }
        return map;
    }
}
