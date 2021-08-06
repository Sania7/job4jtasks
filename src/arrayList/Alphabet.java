package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1.7. Буквы в алфавитном порядке.
 * Вам необходимо реализовать метод, который принимает строку,
 * которое является одним словом, без знаков препинания цифр и пробелов.
 * Метод должен вернуть новую строку,
 * в которой все символы исходной строки будут расставлены в алфавитном порядке.
 *
 * Для разделения строки на подстроки используйте метод split(),
 * добавьте все элементы в коллекцию List<String>,
 * отсортируйте в порядке возрастания - используйте метод sort,
 * в который передадите компаратор. Новую строку сформируйте с помощью StringBuilder.
 */
public class Alphabet {
    public static String reformat(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (String s1 : list) {
            stringBuilder.append(s1);
        }
        return stringBuilder.toString();
    }
}
