package loop;

import java.util.Scanner;

/**
 * 11. Шифр строки.
 * Необходимо реализовать метод, который принимает строку,
 * которую необходимо зашифровать таким образом,
 * чтобы на выходе отражались только 4 последних элемента,
 * все остальные были заменены на #. При этом соблюсти условия:
 * 1. Если входная строка пустая - необходимо вернуть строку "empty";
 * 2. Если входная строка содержит больше 0 и не более 4 символов - метод должен вернуть исходную строку.
 * Для решения используйте StringBuilder и его метод setCharAt().
 */

public class Cryptography {
    static Scanner scanner = new Scanner(System.in);
    public static String code(String s) {
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
            if (str.equals("")) { // проверяем пустая ли строка
                str = "empty"; // если строка пустая то присваиваем empty
            } else if (str.length() > 4) { // проверяем если строка более 4 символов
                StringBuilder string = new StringBuilder(str);
                for (int i = str.length() - 5; i >= 0; i--) {
                    string.setCharAt(i, '#');
                }
                str = string.toString();
            }
            return str;
        }
        public static void main (String[]args){
            String crypt = Cryptography.code(" ");
            System.out.println(crypt);
        }
    }

