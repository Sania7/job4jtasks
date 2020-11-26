package array;

public class Converter {
    public static int[][] convertSquareArray(int[][] array) {
        int arrayElement = 0;
        for (int[] rows : array) {
            arrayElement += rows.length;
        }
        int sqArSize = (int) Math.ceil(Math.sqrt(arrayElement));
        int[][] squareArray = new int[sqArSize][sqArSize];
        int squareArRow = 0, squareArCell = 0;
        for (int[] rows : array) {
            for (int cells : rows) {
                squareArray[squareArRow][squareArCell] = cells;
                squareArCell++;
                if (squareArCell == sqArSize) {
                    squareArCell = 0;
                    squareArRow++;
                }
            }
        }
        return squareArray;
    }
}
