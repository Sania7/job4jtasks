package solution;

public class Praktikum1 {
    public static void main(String[] args) {
        int carrotCount = 0; // Объявляем переменную для общего числа морковок
        int carrotPerDay = 5; // В этой переменной фиксируем ежедневный рацион

        // Число итераций совпадает с количеством дней в неделе
        for(int day = 1; day <= 7; day = day + 1) { // Переменная итерирования - day
            carrotCount = carrotCount + carrotPerDay; // При каждой итерации плюс 5 морковок
            // Сколько морковок Байт съедает за разное количество дней
            System.out.println(day + "-й день, Байт съест " + carrotCount + " морковок.");
        }
        // Сколько овощей требуется покупать на неделю
        System.out.println("Рацион на неделю: " + carrotCount + " морковок.");
    }
}
