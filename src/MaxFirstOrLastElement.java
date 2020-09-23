public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
             if (array[0] > array[array.length - 1] || array[0] < array[array.length - 1]) {
                 return array.length;
             }
        }
        return array[0];
    }
}

