package solution.praktikumarrays;

import java.util.Random;

public class Arrays4 {
    public static void main(String[] args) {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[7];


        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        for (int k = 0;k < expenses.length;k++) {
            expenses[k] = random.nextInt(1000);
        }

        System.out.println("Траты за неделю:");
        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено рублей: ..."
        for (int j = 0;j < expenses.length;j++) {
            System.out.println("День " + (j + 1) + "."  + " Потрачено рублей: " + expenses[j]);
        }

        int sum = 0;
        // Посчитайте и выведите сумму трат за неделю — используйте цикл и здесь
        for (int a = 0; a < expenses.length; a++) {
            sum = sum + expenses[a];
        }
             System.out.println("Траты в рублях за неделю: " + sum);
    }
}
