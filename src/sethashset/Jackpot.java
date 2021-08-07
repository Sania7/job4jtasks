package sethashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    /**
     * 0.5. Джекпот в казино
     * Выигрышной комбинацией для джекпота в казино считается такая,
     * в которой все элементы одинаковые.
     * @param combination Метод принимает массив строк,
     *           который содержит последовательность элементов игровой комбинации.
     * @return Метод должен вернуть true - если комбинация является выигрышной.
     * Напомню, что коллекция Set не допускает наличие дубликатов.
     * Поэтому если все элементы массива добавить в коллекцию типа Set,
     * то размер коллекции будет равен 1 при условии, что комбинация выигрышная.
     */
//    public static boolean checkYourWin(String[] combination) {
//        for (String s : combination) {
//            if (!(s.equals(combination[0]))) {
//                return false;
//            }
//        }
//        return true;
//    }


    public static boolean checkYourWin(String[] combination) {
        Set<String> rsl = new HashSet<>(Arrays.asList(combination));
        return rsl.size() == 1;
    }
}
