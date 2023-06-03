package me.ssagan.week2app.task8;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Дана строка «Training Java». Выведите на экран её длину и символ,
        //который стоит на 5 позиции, а затем добавьте к ней строку с
        //сегодняшним числом и выведите результат на экран.
        String str = "Training Java";
        System.out.println("Длина строки Training Java равна " + str.length());

        char ch = str.charAt(6);
        System.out.println("Символ, который стоит на 5 позиции " + str.charAt(6));

        System.out.println("К символу добавим сегодняшее число " + Character.toString(ch) + LocalDate.now());
    }
}
