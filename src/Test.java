public class Test {
    public static void main(String[] args) {
        int[][] list = new int[10][];
        int count = 1;
        for (int i = 0; i < 10; i++) {
            list[i] = new int[i + 1];
            for (int j = 0; j < 10; j++) {
                count++;
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
    }
}