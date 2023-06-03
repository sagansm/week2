package me.ssagan.week2app.task6.service;

public class TriangleDemonstrator {
    public static void demo(int a, int b) {
        //Решите задачу с помощью программы. Известны катеты прямоугольного треугольника:
        //основание = 5, боковая сторона = 8, найдите его площадь и периметр и выведите на экран
        int triangleSquare = TriangleCalculator.calculateSquare(a,b);
        int trianglePerimeter = TriangleCalculator.calculatePerimeter(a,b);

        System.out.println("Square of triangle with legs " + a + " and " + b + " is " + triangleSquare);
        System.out.println("Perimeter of triangle with legs " + a + " and " + b + " is " + trianglePerimeter);

        //Периметр больше 15?
        System.out.println("Perimeter is over 15? " + (trianglePerimeter > 15));

        //Площадь меньше 30?
        System.out.println("Square is under 30? " + (triangleSquare < 30));
    }
}
