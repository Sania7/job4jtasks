import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner read = new Scanner(System.in);
        int ticketNumber = read.nextInt();
        if (ticketNumber % 10 == 0 || ticketNumber % 9 == 0) {
            System.out.println("You won 200$");
        }

        if (ticketNumber % 4 == 0 || ticketNumber % 6 == 0) {
            System.out.println("You won 50$");
        } else {
            System.out.println("Try again!");
        }
    }
}
