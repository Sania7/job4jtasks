public class Test {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int count = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                count++;
                if (count == number) {
                    return i;
                }
            }
        }
        return rsl;
    }
    public static void main(String[] args) {
        char[] string = new char[] {'b', 'a', 'y', 'o', 'f'};
        for (int i = 0; i < string.length; i++) {



        }
    }
}

