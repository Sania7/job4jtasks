package array;

/**
 * 26. Получить правую диагональ квадратного массива
 * Вам дана квадратная матрица. Нужно получить правую диагональ. Правая диагональ это диагональ матрицы,
 * которая идет справа налево.
 * Например, для {{1, 2}, {3, 4}} это будет {2, 3}, левой в этом случае будет {1, 4}.
 */
public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] rsl = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            rsl[i] = data[i][data.length - 1 - i];
        }
        return rsl;
    }
}
