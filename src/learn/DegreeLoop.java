package learn;

public class DegreeLoop {
    public static int calculate(int a, int b) {
        int rsl = 1;
        for (int i = 1; i <= b; i++) {
            rsl = rsl * a;
        }
        return rsl;
    }
}
