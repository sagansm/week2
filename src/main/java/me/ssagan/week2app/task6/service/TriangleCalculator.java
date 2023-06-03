package me.ssagan.week2app.task6.service;

public class TriangleCalculator {
    public static int calculateSquare(int a, int b) {
        return (a * b) / 2;
    }

    public static int calculatePerimeter(int a, int b) {
        return (int) (a + b + Math.sqrt(a*a + b*b));
    }
}
