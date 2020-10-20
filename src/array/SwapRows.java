package array;

/**
 * 23. Переставить две строки в матрице.
 * Нужно переставить две строки в матрице, с учетом, что длины строк одинаковые. src, dest это индексы строк.
 */

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        for (int i = 0; i < data[0].length; i++) {
                int temp = data[src][i];
                data[src][i] = data[dst][i];
                data[dst][i] = temp;
        }

    }
}
