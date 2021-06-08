package learn;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftPoint = 0;// переменные начальные точки
        int rightPoint = 0;
        int rslPoint = 0;
        while (leftPoint + rightPoint != rsl.length) { //цикл пока начальные точки не равны длине результатируещего массива

            if (leftPoint != left.length && rightPoint != right.length) {//проверяем если левая начальная точка не равна длинне
                // левого массива И правая начальная точка не равна длине правого массива, то -
                rsl[rslPoint++] = left[leftPoint] < right[rightPoint] ? left[leftPoint++] : right[rightPoint++];
                //тернарным оператором проверяем: если
            } else if (leftPoint != left.length) {
                rsl[rslPoint++] = left[leftPoint++];
            } else {
                rsl[rslPoint++] = right[rightPoint++];
            }
        }
        return rsl;
    }
}