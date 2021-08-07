package vk;

public class ArrayMin {
    public static void main(String[] args) {
        int[] array = {45, 54, 56, 23, 13, 67, 89, 39, 28, 94, 83};
        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }
        System.out.println("min value = " + minValue);
        System.out.println("min index = " + minIndex);

    }
}
