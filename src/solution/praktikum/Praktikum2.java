package solution.praktikum;

public class Praktikum2 {
    public static void main(String[] args) {
        System.out.println("Это первый этаж дома, который построил Джек.");
        // Вместо многоточий добавьте нужные значения
        int i;
        for ( i = 2;i < 10;i++) {
            //Место для вывода
            System.out.println("А это " + i + " этаж, он на один выше, чем этаж " + (i - 1));
        }
        System.out.println("А это " + i + " этаж, он на один выше, чем этаж " + (i - 1));
    }
}
