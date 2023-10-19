package org.medwed_sa.Lessen.Lesson_1_IntroductionToOOP.EX003;

/**
 * Три разных пользовательских кода создания экземпляра класса (разделены чертой), отличаются предаваемыми данными.
 * И в зависимости от этого используются разные конструкторы.
 * Получили Point2D a и Point2D b с помощью разных конструкторов, передали в метод distance().
 */
public class Program {

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
//      ____________________
        Point2D a = new Point2D(0.34, 4.22);
        System.out.printf("a = %s\n", a.toString()); // печать сущности.
//      ____________________
        Point2D b = new Point2D();
        b.x = 0.9854;
        b.y = 10.033;
        System.out.printf("b = %s\n", b); // печать сущности.
//      ___________________
        Point2D s = new Point2D(0.77);
        System.out.printf("b = %s\n", s); // печать сущности.

        System.out.println(distance(a, b)); // печать решения метода.

    }

}
