package solution.praktikum;

public class Praktikum5 {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 0; i < 10; i = i + 1) {
            if (i > 7) {
                counter = counter + 2;
                System.out.println(counter);
            }
            counter = counter + 1;
            System.out.print(counter);
        }
    }
}
