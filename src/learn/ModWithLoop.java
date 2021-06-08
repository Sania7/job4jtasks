package learn;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int rsl = n - (n / d) * d;
        return rsl;
    }
}
