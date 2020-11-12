package array;

/**
 * 30. Превратить одномерный массив в двумерный.
 * Метод принимает массив целочисленных значений. Необходимо реализовать метод,
 * который превратит одномерный массив в квадратный двумерный.
 * Напомню, что квадратный двумерный массив - это массив, в котором число рядов и элементов в каждом ряду одинаково.
 * При этом если элементов в исходном массиве не хватает,
 * чтобы заполнить весь двумерный массив - необходимо заполнить его 0.
 */
public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int[][] out = new int[array.length / 3 + 1][array.length / 3 + 1];
        int count = 0;
        for (int i = 0; i <= out.length - 1; i++) {
            for (int j = 0; j <= out.length - 1; j++) {
                out[i][j] = array[count];
                count++;
                if (count >= array.length) {
                    break;
                }
            }
        }
        return out;
    }
}
