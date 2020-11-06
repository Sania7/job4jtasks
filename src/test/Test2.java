package test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String[] strArray = new String[] {"Java", "PHP", ".NET", "Perl"};
        String newString = Arrays.toString(strArray);
        newString = newString.substring(1, newString.length() - 1);
        System.out.println("New String: " + newString);
    }
}
