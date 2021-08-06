package sethashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    /**
     * 0.3. Панграмма
     * Панграмма - короткий текст, который использует все буквы алфавита,
     * по возможности не повторяя их.
     *
     * Метод принимает строку(на английском языке).
     * Необходимо реализовать его так,
     * чтобы метод определил является ли входящая строка панграммой.
     * Строчные и прописные буквы являются одинаковыми символами,
     * пробелы необходимо игнорировать.
     * Напомню, что в английском алфавите 26 букв.
     *
     * @param s параметры метода
     * @return возвращаемый результат
     */
    public static boolean checkString(String s) {
        s = s.replaceAll("\\s+", "");
        s = s.toLowerCase();
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));
        return set.size() == 26;
    }
}
