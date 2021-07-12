package loop;

public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int sum = 1;
        for (int i = a; i <= b; i++) {
            sum = sum *  i;
        }
        return sum;
    }
}
