package solution.praktikum;

import java.util.Scanner;

public class Praktikum8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас сейчас: ");
        double balance = scanner.nextDouble(); // Ваши сбережения
        int years = 0;

        while (balance < 1000000) {
            balance = balance + balance * 0.05;
            years++;
        }

        System.out.println("Через " + years + " лет у вас будет миллион!");
    }
}
