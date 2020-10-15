package array;

/**
 * Метод принимает массив целочисленных значений, при этом это могут быть как положительные значения,
 * так и отрицательные. Необходимо реализовать в методе следующее:
 * 1. Найти максимальное значение в массиве;
 * 2. Найти минимальное значение в массиве;
 * 3. Вернуть разницу между максимальным и минимальным значением в массиве.
 * При этом массив не может быть пустым, поэтому дополнительная проверка, что длина массива больше 0 - не нужна.
 */

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int maxIndex = 0;
        int minIndex = 0;
        int maxValue = ints[maxIndex];
        for (int i = 0; i < ints.length; i++) {
            if (maxValue < ints[i]) {
                maxValue = ints[i];
                maxIndex = i;
            }
        }
        int minValue = ints[minIndex];
        for (int i = 0; i < ints.length; i++) {
            if (minValue > ints[i]) {
                minValue = ints[i];
                minIndex = i;
            }
        }
        int diff = maxValue - minValue;
        return diff;
    }
}