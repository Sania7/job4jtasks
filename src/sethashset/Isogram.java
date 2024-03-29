package sethashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    /**
     *Изограмма - это слово, которое не содержит повторяющихся букв, т.е. все буквы в таком слове уникальные.
     *
     * Метод принимает на входе строку,
     * которая является словом, все буквы написаны в нижнем регистре.
     * Входная строка - не фраза, а одно слово, поэтому ее не нужно делить на слова.
     *
     * @param s Метод принимает на входе строку, которая является словом,
     *          все буквы написаны в нижнем регистре.
     *         Входная строка - не фраза, а одно слово,
     *          поэтому ее не нужно делить на слова.
     * @return Метод должен вернуть булево значение -
     * если слово является изограммой - то метод вернет true, иначе - false.
     */
    public static boolean checkString(String s) {
        Set<String> rsl = new HashSet<>(Arrays.asList(s.split("")));
        return rsl.size() == s.length();
    }
}
