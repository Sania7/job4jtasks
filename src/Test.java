import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 5, 1};
        int q = 1;
        int e = -1;
        int max = -1;
        int pos = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                q++;
                if (max < q) {
                    max = q;
                    pos = i;
                    e = arr[i];
                }
            } else {
                q = 1;
            }
        }
        System.out.println("элемент " + e + " повторяется " + max + " раз, начиная с позиции " + pos);
    }
}

