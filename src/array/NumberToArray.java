package array;
/**
 * 41. Массив цифр
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * Например
 * 12345 => {5, 4, 3, 2, 1}
 */

public class NumberToArray {
    public static int[] resolve(int number) {
        char[] digits = Integer.toString(number).toCharArray();
        int[] rsl = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            rsl[digits.length - i - 1] = Integer.parseInt(String.valueOf(digits[i]));
        }
        return rsl;
    }
}
