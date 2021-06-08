package learn;

public class IndexMaxElement {
    public static int getIndexMax(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int rsl = array[i] > array[array.length - 1] ? 0 : array.length - 1;
            return rsl;
        }
        return array.length;
    }
}
