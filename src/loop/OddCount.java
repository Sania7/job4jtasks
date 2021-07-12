package loop;

public class OddCount {
    public static int count(int a, int b) {
        int counter = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
