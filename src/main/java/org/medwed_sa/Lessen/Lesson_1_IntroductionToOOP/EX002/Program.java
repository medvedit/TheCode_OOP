package org.medwed_sa.Lessen.Lesson_1_IntroductionToOOP.EX002;


/**
 * Тут уже присутствует класс Point2D, в котором есть просто два поля, далее в main происходит создание
 * экземпляров класса от Point2D -> Point2D a и Point2D b с присвоением значения к каждой переменной созданного
 * экземпляра, и передача в функцию, уже, не переменных, а именно экземпляров.
 * Вывод:
 * Из функции - понятен.
 * При распечатке экземпляра класса - вывод не читаем для взгляда человека.
 * Исправим то в следующем примере...
 */
public class Program {

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {

        Point2D a = new Point2D();
        a.x = 0.56;
        a.y = 2.22;
        System.out.printf("a = %s\n", a.toString()); // toString() - моно не писать, т.к. он будет выполнен по умолчанию.

        Point2D b = new Point2D();
        b.x = 0.9854;
        b.y = 10.033;
        System.out.printf("b = %s\n", b); // отсутствие toString() - вывод не изменил.

        System.out.println(distance(a, b));

    }

}
