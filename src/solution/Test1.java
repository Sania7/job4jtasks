package solution;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "first"); // добавляем пару ключ значение
        map.computeIfAbsent(2, key -> "second" + "_" + key); // вычисляем значение для
        // ключа которого нет в отоборажении
        System.out.println(map.get(2)); // будет выведено second2
        System.out.println();

        map.computeIfAbsent(1, key -> "first" + "_" + key);// вычисляем значение для
        // ключа который есть в отображении
        System.out.println(map.get(1));
    }
}
