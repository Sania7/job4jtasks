public class Test {
    public static void main(String[] args) {
        int[] c = {5, 4, 3, 2, 1};
        int sum  = 0;
        for (int i = 0; i < c.length; i++) {
            while (c[i] > 0) {
                sum = (c[0] - c[1]) + (c[1] - c[2]);
            }
        }
        System.out.println(sum);
    }
}