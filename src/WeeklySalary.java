public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        int rate = 10;
        int overNorm = 15;
//        int workOnTheDayOff = 20;
//        int aboveTheNormOnTheDayOff = 30;
        int[] week = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < week.length; i++) {
            if (week[i] != 6 || week[i] != 7) {
//                salary = rate * hours;
            }
        }

        return salary;
    }
}
