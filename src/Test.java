import java.util.Arrays;

public class Test {
    public static int calculate(int[] hours) {
        int pay = 0;
        int overpay = 0;
        int pay1 = 0;
        int overpay1 = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    pay = hours[i] * 10 + pay;
                } else {
                    overpay = 80 + ((hours[i] - 8) * 15) + overpay;
                }
            }
            if (i >= 5) {
                if (hours[i] <= 8) {
                    pay1 = hours[i] * 20;
                } else {
                    overpay1 = 160 + ((hours[i] - 8) * 30) + overpay1;
                }
            }
        }
        return pay + overpay + pay1 + overpay1;


    }
}

