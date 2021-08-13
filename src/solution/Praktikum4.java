package solution;

public class Praktikum4 {
    public static void main(String[] args) {
        int money = 500; // Деньги на корм
        int foodPerDay = 100; // Стоимость пачки корма
        int days = 0; // Дни, когда вы сможете покупать корм

		 // Здесь опишите цикл, начинаем с 500 рублей
         // Здесь отразите, что вы будете покупать корм каждые три дня
       	// Опишите строку вывода
        // Цикл оканчивается здесь
        for (int i = money - foodPerDay, j = days + 3; 0 <= i; i -= foodPerDay, j+=3) {
            System.out.println("На " + j + "-й день останется " + i + " рублей.");
            days+=3;
        }

        System.out.println("Денег хватит на " + days + " дней.");
    }
}
