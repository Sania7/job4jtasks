package fraiman;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int lon;
        s = scanner.nextLine();
        lon = s.length();
        for (int i = 0; i < lon; i++) {
            System.out.print(s.charAt(i) + "#");
        }
    }
}
