public class Test {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n * i + j;
            }
        }
        System.out.println("Начальная матрица");
        System.out.println("-------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "    ");
            }
            System.out.println();
        }
    }
}