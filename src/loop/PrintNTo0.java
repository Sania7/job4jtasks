package loop;

//3. Вывести на консоль числа от N до 0
//Выведите на консоль числа от N до 0. N не входит.
// В этом упражнении используйте цикл for c index

public class PrintNTo0 {
    public static void out(int n) {
        for (int index = n - 1;index >= 0; index--) {
            System.out.println(index);
        }
    }
}
