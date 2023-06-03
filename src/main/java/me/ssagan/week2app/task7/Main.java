package me.ssagan.week2app.task7;

public class Main {
    public static void main(String[] args) {
        //Даны переменные b = 50, c = 20. Увеличьте b на 1, затем уменьшите c на 1,
        //используя унарные операции. Выведите на экран проверку условия:
        //b больше либо равно 51 или с меньше 22, используя логическую операцию.
        int b = 50;
        int c = 20;
        b = ++b;
        c = --c;
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println(b + " больше либо равно 51 или " + c + " меньше 22? " + ((b >= 51)||(c<22)));
        ;
    }
}
