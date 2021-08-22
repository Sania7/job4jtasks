package solution.praktikumarrays;

import java.util.Scanner;

public class Teat {


        public static void main(String[] args) {
            System.out.println("Введите секунды: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            while (num <= 86400) {
                int h = num / 3600;
                int m = (num % 3600) / 60;
                int s = num % 60;
                String a = String.valueOf(m);
                System.out.println("Количество часов в секундах - " + h);
                System.out.println("Количество минут в секундах - " + a);
                System.out.println("Количество секунд - " + s);
                // System.out.format("%02d" + ":" + "%02d" + ":" + "%02d", h , m, s);
                break;
            }
        }
   }

