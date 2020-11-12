package test;

public class Test1 {
    public static void main(String[] args) {
        int[] matrix = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double lengthInReal = Math.sqrt(matrix.length);
        int doubleMatrixLength = (int) lengthInReal;
        int[][] doubleMatrix = new int[doubleMatrixLength][doubleMatrixLength];

        for (int f = 0; f < doubleMatrixLength; f++) {
            for (int s = 0; s < doubleMatrixLength; s++) {
                doubleMatrix[f][s] = matrix[f * doubleMatrixLength + s];
                System.out.print(doubleMatrix[f][s] + " ");
            }
            System.out.println();
        }

    }
}