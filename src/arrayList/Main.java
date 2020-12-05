package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // пустой конструктор с начальной емкостью - 10;
        list.add("Hello");
        list.add(0, "Amigo");
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
