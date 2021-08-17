package solution.praktikum;

public class Praktikum3 {
    public static void main(String[] args) {
        int days = 5; // Количество дней
        int moneyPerDay = 200; // Нужно откладывать в день
        int sum = 0; // Переменная, которая хранит общую сумму накоплений

        for (days = 1;days <= 5;days++) {
            sum += moneyPerDay; // Каждый день увеличивается на значение moneyPerDay
            // место для вывода
            System.out.println("День " + days + "." + " Уже " + sum + " руб.");
        }
    }
}
