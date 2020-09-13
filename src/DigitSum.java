public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        int i = num;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
