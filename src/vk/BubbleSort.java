package vk;

import java.util.Arrays;
// сортировка пузырьком
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {45, 54, 56, 23, 13, 67, 89, 39, 28, 94, 83};
        // начальное состояние массива false - не отсортирован.
        boolean isSorted = false;

        while (!isSorted) {
            // проходим по массиву циклом
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                // сравниваем если i < i - 1
                if (array[i] < array[i - 1]) {
                    // помещаем i во временную переменную
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
