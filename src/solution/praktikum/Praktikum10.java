package solution.praktikum;

import java.util.Scanner;

public class Praktikum10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Сумма
        int input = -1; // Ввод пользователя



        while (input != 0) {

            input = scanner.nextInt();

            sum += input;
        }
        System.out.println("Сумма введённых чисел: " + sum);
    }
}
