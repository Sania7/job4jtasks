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
        int count = 0;
        int rows = 0;
        int column = 0;
        int[][] matrix = new int[rows][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[count++];
            }
        }
        return matrix;
    }
}
