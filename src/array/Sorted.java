package array;

public class Sorted {
    public static boolean isSorted(int[] array) {
// проходим по массиву циклом и последний элемент array.length - 1
//если элемент плюс один меньше следующего возвращаем false иначе true
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }
}
