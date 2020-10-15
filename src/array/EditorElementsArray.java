package array;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        int[][] result = array;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                if (result[i][j] > el) {
                    int diff = result[i][j] - el;
                    result[i][j] = diff;
                }
                if (result[i][j] <= el) {
                    result[i][j] = 0;
                }
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        int[][] rsl = new int[5][7];
        int el = 3;
        System.out.println(changeData(rsl, el));
    }
}
