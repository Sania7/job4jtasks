package learn;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    System.out.println(left[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] left = new int[] {5, 4, 3, 2};
        int[] right = new int[] {5, 6, 3, 8};
        CrossArray.printCrossEl(left, right);
    }
}
