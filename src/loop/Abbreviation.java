package loop;

public class Abbreviation {
    public static String collect(String s) {

        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char a  = s.charAt(i);
            if (Character.isUpperCase(a)) {
                newString.append(a);
            }
        }
        return newString.toString();
    }
}
