package maphashmap;

import java.util.HashMap;
import java.util.Map;

public class MostUsedCharacter {
    /**
     * 1.7. Найти символ который используется в строке наибольшее количество раз
     *
     * Метод принимает строку, которая может содержать несколько пробелов,
     * однако в ней отсутствуют знаки препинания.
     *
     * Необходимо реализовать метод, который вернет символ в строке,
     * который употребляется наибольшее количество раз.
     * Если окажется что таких символов несколько
     * - необходимо вернуть первый из символов.
     * Чтобы обеспечить сортировку символов - собирайте исходную строку в TreeMap(),
     * в которой ключ - это символ, значение - количество.
     * Перед тем как собирать строку ее нужно привести к нижнему регистру,
     * удалить пробелы.
     *
     * Для того, чтобы собрать строку в отображение используйте методы
     * computeIfPresent() и putIfAbsent() - первый обновит значение частотности
     * употребления символа, второй - вставит пару ключ(символ) значение(1) -
     * если такого символа в отображении еще нет.
     *
     * @param str  параметр метода
     * @return вернуть символ в строке, который употребляется наибольшее количество раз.
     */
    public static char getMaxCount(String str) {
        Map<Character, Integer> letter = new HashMap<>();
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", "");
        char[] chars = str.toCharArray();
        char rsl = ' ';
        int count = 0;
        for (char letters : chars) {
            letter.computeIfPresent(letters, (key, value) -> value + 1);
            letter.putIfAbsent(letters, 0);
        }
        for (Character key : letter.keySet()) {
            if (letter.get(key) > count) {
                rsl = key;
                count = letter.get(key);
            }
        }
        return rsl;
    }
}
