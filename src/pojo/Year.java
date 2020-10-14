package pojo;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Введите год!");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " високосный год!");
        } else {
            System.out.println(year + " не високосный год!");
        }
    }
}
