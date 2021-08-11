package solution;

import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bill");
        map.merge(1, "Clinton", (oldV, newV) -> oldV + " " + newV);
        System.out.println(map.get(1));
        map.merge(2, "Trump", (oldV, newV) -> oldV + " " + newV);
        System.out.println(map.get(2));
        map.merge(2, "Donald", (oldV, newV) -> oldV + " " + newV);
        System.out.println(map.get(2));
    }
}
