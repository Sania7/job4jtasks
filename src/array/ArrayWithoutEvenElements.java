package array;

/*
37. Массив без четных значений.
Метод принимает массив целочисленных значений.
Необходимо перебрать этот массив выбрать из него только нечетные числа и вернуть новый массив,
 в котором будут только нечетные числа.
 При этом длина нового массива должна совпадать с количеством нечетных значений в исходном массиве.
В этой задаче будет необходимо использовать оператор continue.
 */


public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] out = new int[data.length / 2];
        int index = 0;
        while (index < out.length) {
            for (int datum : data) {
                if (datum % 2 != 0) {
                    out[index] = datum;
                    index++;
                }
            }
        }
         return out;
    }
}
