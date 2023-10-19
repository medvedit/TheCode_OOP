package org.medwed_sa.Lessen.Lesson_1_IntroductionToOOP.EX001;

public class pointMethod {

    /**
     * Метод принимающий на вход четыре аргумента, две точки, каждая из которых располагается и по охи x и по оси y
     * Функция считает расстояние между двумя точками по переданным в нее координатам.
     * Тут всё просто. Все функции и переменные в одном классе.
     * Дальше будет правильнее относительно принципов ООП.
     */
    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        double ax = 5.88;
        double ay = 2.02;
        double bx = 9.72;
        double by = 1;
        System.out.println(distance(ax, ay, bx, by));
        // Создать точку
        // Печать точки
    }

}
