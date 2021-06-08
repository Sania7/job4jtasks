package learn;/*
Двухмерные массивы - в первом методе проходим по всему массиву и возвращаем длинну массива.

Во втором методе проходим по всему массиву плюс по индексам строки row и возвращаем длинну массива.
 */

public class Board {
    public static int getCountRow(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            return array.length;
        }
        return -1;
    }
    public static int getCountCellInRow(int[][] array, int row) {
        for (int j = 0; j < array[row].length; j++) {
            return array.length;
        }
        return -1;
    }
}
