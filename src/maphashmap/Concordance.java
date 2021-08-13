package maphashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    /**
     *2.3. Индексы символов
     *
     * Метод принимает строку, при этом слова могут содержать как строчные символы,
     * так и прописные. При реализации необходимо игнорировать пробелы во входной строке.
     *
     * @param s
     * @return Необходимо реализовать метод,
     * который вернет отображение, в котором ключом будет символ из строки,
     * а значением - список индексов,
     * под которыми этот символ (если таких символов несколько) входит в исходную строку.
     * Важно: строчные и прописные символы считаются разными символами.
     */
    public static Map<Character, List<Integer>> collectCharacters(String s) {
       // игнорируем пробелы во входной стороке
        s = s.replaceAll("\\s+", "");
        // создаем мапу
        Map<Character, List<Integer>> map = new HashMap<>();
        // создаем массив символов chars  методом toCharArray
        char[] chars = s.toCharArray();
        // проходим циклом по этому массиву
        for (int i = 0;i < chars.length;i++) {
            //добавляет значение в отображение, только если его там не было.
            map.putIfAbsent(chars[i], new ArrayList<>());
            //возвращает значение объекта, ключ которого равен k.
            // Если такого элемента не окажется, то возвращается значение null
            map.get(chars[i]).add(i);
        }
        return map;
    }
}
