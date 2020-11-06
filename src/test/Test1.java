package test;

public class Test1 {
    public static void main(String[] args) {
        String[] array = {"one","two"};
        String s = "";

        for(int i = 0; i < array.length; i++) {
            s = s + array[i] + ' ';
        }

        System.out.print(s);
    }
}

