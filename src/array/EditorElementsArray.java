package array;

public class EditorElementsArray {
    public static int[][] changeData(int[][] array, int el) {
        int[][] result = new int[array.length][];
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
        return array;
    }
}
