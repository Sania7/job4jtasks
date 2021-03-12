package array;

/**
 * 53. Четные vs Нечетные
 * Вам даны очки игроков. Игроки разделись таким образом,
 * что под четными индексами находятся очки первой команды,
 * под нечетными второй. Ваша задача определить, кто выиграл.
 * Выигрывает та команда, которая набрала наибольшее число очков.
 * Если выиграла первая команда, то нужно вернуть 1, если вторая, то 2, если ничья то 0.
 */

public class EvenVsOdd {
    public static int whoWins(int[] players) {
        int index1 = 0;
        int index2 = 0;
        int result = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 != 0) {
                index1 += players[i];
            } else {
                index2 += players[i];
            }
        }
            if(index1 > index2) {
                result = 2;
            } else if (index2 > index1) {
                result = 1;
            }
        return result;
    }
}
