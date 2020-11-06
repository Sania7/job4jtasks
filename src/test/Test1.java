package test;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Введиде ФИО: ");
        Scanner scanner = new Scanner(System.in);
        String fio = scanner.nextLine();
        Pattern pattern = Pattern.compile("[А-ЯЁ][а-яё]+\\s[А-ЯЁ][а-яё]+\\s?-?[А-ЯЁ][а-яё]+-?([А-ЯЁ]?[а-яё])+");
        Matcher matcher = pattern.matcher(fio);
        if (matcher.matches()) {
            String[]part = fio.split("\\s+");
            String[]FIO = {"Фамилия: ", "Имя: ","Отчество: "};

            for (int i = 0;i < part.length;i++) {
                System.out.println(FIO[i] + " " + part[i]);}
        }
        else
        {
            System.out.println("Введите Фамилию Имя Отчество!");
        }
    }
}

