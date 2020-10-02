public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (int i = 1; i <= data.length; i++) {
            if (data[3] == data[1] + data[2]) {
                return rsl;
            }
        }
        return false;
    }
}
