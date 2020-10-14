import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
 //                     0  1  2  3  4  5   6  7
        int[] values = {7, 0, 3, 5, 6, 4, 10, 3};
        System.out.println("max index = " + findMaxIndex(values));
        System.out.println("min index = " + findMinIndex(values));
        System.out.println("max + min = " + calculateSum(values));
    }
    public static int calculateSum(int[] values) {
        int minIndex = findMinIndex(values);
        int maxIndex = findMaxIndex(values);
        if (minIndex > maxIndex) {
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }
        int rsl = 0;
        for (int i = minIndex + 1; i <= maxIndex; i++) {
            rsl += values[i];
        }
        return rsl;
    }
    public static int findMinIndex(int[] values) {
        int minIndex = 0;
        int minValue = values[minIndex];
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMaxIndex(int[] values) {
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for (int i = 0; i < values.length; i++) {
            if (maxValue < values[i]) {
                maxValue = values[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
