public class OddPrint {
    public static void print(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                System.out.print(array[index]);
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            OddPrint.print(array);
    }
}
