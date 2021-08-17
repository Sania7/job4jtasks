package solution.praktikumarrays;

import java.util.Scanner;

public class Praktikum2 {

        public static void main(String[] args) {
            String[] currencies = {"DKK","CNY","JPY","RUB"};

            System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
            System.out.println(currencies[0]);
            System.out.println(currencies[1]);
            System.out.println(currencies[2]);
            System.out.println(currencies[3]);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Если вы планируете поездку в Данию, введите 1, а если в Китай, введите 2");

            int country = scanner.nextInt();  // Считайте из консоли ввод пользователя

            if (country == 1) {
                // Если выбрана Дания, измените значение элемента евро на кроны DKK
                System.out.println(currencies[0]);
            } else if (country == 2) {
                // Если Китай, измените значение элемента иена на юани CNY
                System.out.println(currencies[1]);
            }

            System.out.println("В вашем тревел-кошельке доступны следующие валюты:");
            System.out.println(currencies[0]);
            System.out.println(currencies[1]);
            System.out.println(currencies[2]);
            System.out.println(currencies[3]);
        }
}
