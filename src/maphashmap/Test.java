package maphashmap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("KING", 100);
        System.out.println("KING".hashCode());
    }
}
