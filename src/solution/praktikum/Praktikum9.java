package solution.praktikum;

import java.util.Random;
import java.util.Scanner;

public class Praktikum9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000

        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");
        System.out.println("Ваш ход:");

        // Напишите условие цикла для запуска игры
        while (randomInt != userInput) {
        userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя

            if (randomInt < userInput) { // Условие проверяется в цикле
                System.out.println("Меньше");

            } else if (randomInt > userInput) {
                // Второе условие
                System.out.println("Больше");
            }

        }
            if (randomInt == userInput) {
                // Печатаем, когда число угадано
                System.out.println("Вы великолепны! Именно это я загадал.");
            }
        }
    }
