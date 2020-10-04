package array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                for (int j = 0; j < i; j++) {
                    sum = sum + data[j];
                }

                if (sum % 2 == 0) {
                    return sum;
                } else {
                    break;
                }
            }
        }
        return 0;
    }
}

