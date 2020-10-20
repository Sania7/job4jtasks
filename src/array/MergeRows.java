package array;

/**
 * 25. Объединить строки квадратного массива
 * Дана квадратная матрица. Ваша задача объединить ее строки в один массив
 * Например, для {{1, 2}, {3, 4}} получить {1, 2, 3, 4}
 */
public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] oneArray = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                oneArray[(i * data.length) + j] = data[i][j];
            }
        }
        return oneArray;
    }
}
